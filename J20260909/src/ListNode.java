

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;

        ListNode cur = head;//定义cur来遍历链表

        while(cur != null) {
            if(cur.val < x) {
                //第一次
                if(bs == null) {
                    bs = be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }

            }else{
                if(as == null) {
                    as = ae = cur;
                }else{
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }

        if(bs == null) {
            return as;
        }

        if(as == null) {
            return bs;
        }
        be.next = as;
        ae.next = null;//断开
        return bs;
    }
}

class Solution2 {
    public ListNode partition(ListNode head, int x) {
        //使用虚拟头节点和双指针解决
        //链表为空
        if(head == null) {
            return null;
        }
        ListNode lessHead = new ListNode(0);
        ListNode lessTail = lessHead;

        ListNode greatHead = new ListNode(0);
        ListNode greatTail = greatHead;

        ListNode cur = head;
        while(cur != null) {
            if(cur.val < x) {
                lessTail.next = cur;
                lessTail = cur;
            }else{
                greatTail.next = cur;
                greatTail = cur;
            }
            cur = cur.next;
        }
        //断开连接,防止成环
        greatTail.next = null;
        //合并
        lessTail.next = greatHead.next;
        return lessHead.next;
    }
}
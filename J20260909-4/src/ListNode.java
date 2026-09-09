
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


class Solution {
    public boolean hasCycle(ListNode head) {
        //链表为空或链表只有一个节点,肯定没有环
        if(head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;

             if(fast == slow) {
                return true;
             }
        }
        return false;
    }
}
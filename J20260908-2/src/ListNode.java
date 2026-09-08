
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode slow = head;//定义慢指针
        ListNode fast = head;//定义快指针
        //先让快指针走k步
        for(int i = 0;i < k;i++) {
            if(fast != null) {
                fast = fast.next;
            }else{
                return 0;
            }
        }
        //然后同时走
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.val;
    }
}
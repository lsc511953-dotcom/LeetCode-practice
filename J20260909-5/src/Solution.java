
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //链表为空或链表只有一个节点,肯定没环
        if(head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            //判断有没有环
            if(slow == fast) {
               slow = head;
               while(fast != slow) {
                slow = slow.next;
                fast = fast.next;
               }
               return slow;
            }
        }
        return null;
    }
}
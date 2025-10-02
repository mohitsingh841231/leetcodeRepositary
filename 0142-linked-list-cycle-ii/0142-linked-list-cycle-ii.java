/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)return null;
        // if( head.next == null)return -1;
        ListNode slow = head,fast = head;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)break;
        }
        if(slow !=fast)return null;
        ListNode p = head;
        while(slow != p){
            slow = slow.next;
            p = p.next;
        }
        return slow;
        
    }
}
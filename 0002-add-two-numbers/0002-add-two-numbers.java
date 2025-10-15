/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);  // use ListNode
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null ) {
            int sum = carry;

            if (l1 != null)   sum += l1.val; 
            if (l2 != null)  sum += l2.val;
              
                ListNode newNode   =new ListNode(sum%10);
                // l1 = l1.next;
                carry = sum/10;
            current.next =newNode;
            current = current.next;
        }

        return dummy.next;
    }
}

    

    // Utility method to print a linked list
   

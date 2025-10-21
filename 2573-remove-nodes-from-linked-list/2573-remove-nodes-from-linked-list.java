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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp =head;
        while(temp != null){
            while (st.size() >0 && st.peek().val < temp.val) st.pop();
            st.push(temp);
            temp = temp.next;
        }
       ListNode dummy = new ListNode(-1);
        temp = dummy;

        while (!st.isEmpty()) {
            ListNode node = st.pop();
            node.next = null; 
            temp.next = node;
            temp = node;
        }
        return reverse(dummy.next);

       
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
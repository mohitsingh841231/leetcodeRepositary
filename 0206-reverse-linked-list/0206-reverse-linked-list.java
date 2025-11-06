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
    public ListNode reverseList(ListNode head) {
        // ListNode curr = head,prev= null,temp;
        // while(curr!=null){
        //     temp = curr.next;
        //     curr.next = prev;
        //     prev= curr;
        //     curr = temp;
        // }
        // return prev;



        // ListNode temp = head;
    

        // ArrayList<Integer> arr = new ArrayList<>();
        // while( temp !=null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }

        // int n =arr.size()-1;
        // temp = head;
        // while(temp !=null){
        //      temp.val =arr.get(n);
        //     n--;
        //     temp = temp.next;
        // }
        // return head;

        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            temp.val = st.pop();
            // st.pop();
            temp = temp.next;
        }
        return head;



    }

}
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
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();    
        ListNode temp = head;
        
        
        while(temp != null){
            list1.add(temp.val);
            temp = temp.next;
             
        }
        int n =list1.size();
        if (n == 0) return head; 
         k = k % n;
        for(int i = n-k;i<n;i++){
            list2.add(list1.get(i));
        }
        for(int i =0;i<n-k;i++){
            list2.add(list1.get(i));
        }
        ListNode dummy = new ListNode();
        ListNode temp1 = dummy;
        for(int value:list2){
            temp1.next = new ListNode(value);
            temp1 = temp1.next;
        }
        return dummy.next;


    }
}
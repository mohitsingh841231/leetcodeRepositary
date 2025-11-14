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
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode temp1 = head;
        while(temp1 != null){
            arr.add(temp1.val);
            temp1 = temp1.next;
        }
        for(int i =0;i<arr.size()-1;i+=2){
            // if(i%2 == 0){
                int temp  =  arr.get(i+1);
                arr.set(i+1,arr.get(i));
                arr.set(i,temp);
            // }
        }
        // ListNode dummy = new ListNode(0);
        // ListNode temp2 = dummy;
        // for(int i=0;i<arr.size();i++){
        //     temp2.next =new  ListNode(arr.get(i));
        //     temp2 = temp2.next;
        // }
        // return dummy.next;



        temp1 = head;
        int idx =0;
        while(temp1 != null){
            temp1.val = arr.get(idx);
            temp1 = temp1.next;
            idx++;
        }
        return head;
    }
}
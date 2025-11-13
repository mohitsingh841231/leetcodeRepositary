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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
       for (ListNode temp : lists) {        
            while (temp != null) {
                arr.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(arr);
        ListNode dummy = new ListNode(0);
        ListNode temp1 = dummy;
        for(int i =0;i<arr.size();i++){
            temp1.next = new ListNode(arr.get(i));
            temp1 = temp1.next;
        }
        return dummy.next;
    }
}
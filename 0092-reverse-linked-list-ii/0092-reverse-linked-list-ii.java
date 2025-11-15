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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null )return null;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int i =left-1,j = right-1;
        while(i<=j){
            int temp1 = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp1);
            i++;
            j--;
        }
        temp = head;
        int idx =0;
        while(temp != null){
            temp.val = arr.get(idx);
            temp = temp.next;
            idx++;
        }
        return head;

    }
}
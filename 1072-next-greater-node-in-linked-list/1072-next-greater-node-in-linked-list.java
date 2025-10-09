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
    public int[] nextLargerNodes(ListNode head) {
        // ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp1 = head;
        int count =0;
        while(temp1 !=null){
            count++;
            temp1 = temp1.next;
        }

        int arr[] = new int[count];
        ListNode temp = head;
        int x =0;
        while(temp!=null){
             arr[x++] = temp.val;
            temp = temp.next;
        }
        
        int arr2[] = new int[count];
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    arr2[i] = arr[j];
                    break;
                }
                else arr2[i] =0;
            }

        }
        arr2[arr.length-1] = 0;
        return arr2;
    }
}
// import java.utils.*;
class Solution {
    public ListNode partition(ListNode head, int x){
    ArrayList<Integer> arr = new ArrayList<>();
       ListNode temp = head;
       while(temp != null){
        arr.add(temp.val);
        temp = temp.next;

       }
       ArrayList<Integer> first = new ArrayList<>();
       ArrayList<Integer> last = new ArrayList<>();
       for(int i =0;i<arr.size();i++){
            if(arr.get(i) < x)first.add(arr.get(i));
            else last.add(arr.get(i));
       }
        first.addAll(last);
        temp = head;
        int idx =0;
        while(temp != null){
            temp.val = first.get(idx++);
            temp = temp.next;

        }
       return head;


    }
}
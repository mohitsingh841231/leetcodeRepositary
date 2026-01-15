class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;

        int idx = 0;
        ListNode store;

     
        while (idx != b) {
            temp = temp.next;
            idx++;
        }
        store = temp.next;   

    
        temp = list1;
        idx = 0;
        while (idx != a - 1) {
            temp = temp.next;
            idx++;
        }

        temp.next = list2;

  
        ListNode temp2 = list2;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = store;

        return list1;
    }
}

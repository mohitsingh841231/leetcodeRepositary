class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        
        Collections.sort(arr);
        head = new ListNode(arr.get(0));
        ListNode curr = head;
        for (int i = 1; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }

        return head;
    }
}

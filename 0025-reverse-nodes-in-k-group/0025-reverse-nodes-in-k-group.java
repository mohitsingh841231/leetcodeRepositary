class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            st.push(temp.val);
            count++;

            // when we reach k nodes
            if (count == k) {
                while (!st.isEmpty()) {
                    arr.add(st.pop());
                }
                count = 0;
            }

            temp = temp.next;
        }


        Stack<Integer> rev = new Stack<>();
        while (!st.isEmpty()) rev.push(st.pop());
        while (!rev.isEmpty()) arr.add(rev.pop());

        temp = head;
        int idx = 0;
        while (temp != null) {
            temp.val = arr.get(idx++);
            temp = temp.next;
        }

        return head;
    }
}

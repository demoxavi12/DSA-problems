class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        // Count number of nodes
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Position from the beginning
        int k = count - n + 1;

        // If deleting head
        if (k == 1) {
            return head.next;
        }

        // Move to node before the one we want to delete
        temp = head;

        for (int i = 1; i < k - 1; i++) {
            temp = temp.next;
        }

        // Delete kth node
        temp.next = temp.next.next;

        return head;
    }
}
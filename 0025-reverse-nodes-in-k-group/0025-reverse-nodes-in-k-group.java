class Solution {
    public ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    public ListNode findKthNode(ListNode temp, int k) {
        k--;

        while (k > 0 && temp != null) {
            k--;
            temp = temp.next;
        }

        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;

        while (temp != null) {
            ListNode kthNode = findKthNode(temp, k);

            if (kthNode == null) {
                if (prevNode != null) {
                    prevNode.next = temp;
                }
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if (temp == head) {
                head = kthNode;
            } else {
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = nextNode;
        }

        return head;
    }
}
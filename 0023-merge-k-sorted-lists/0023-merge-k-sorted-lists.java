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
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a,b)->Integer.compare(a.val,b.val)
        );

        for(ListNode node:lists){
            if(node != null){
                pq.offer(node);
            }
        }

        ListNode dummyNode = new ListNode(-1);
        ListNode temp= dummyNode;

        while(!pq.isEmpty()){
            ListNode node= pq.poll();
            if(node.next != null){
                pq.offer(node.next);
            }
            temp.next = node;
            temp= temp.next;
        }
        return dummyNode.next;
    }
}
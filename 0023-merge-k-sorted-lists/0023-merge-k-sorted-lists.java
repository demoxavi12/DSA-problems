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
    public ListNode merge(ListNode l1,ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;

        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                res.next=l1;
                l1=l1.next;
            }else{
                res.next=l2;
                l2= l2.next;
            }
            res=res.next;
        }
            if(l1 != null)res.next=l1;
            else res.next=l2;

            return dummyNode.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists==null)return null;
        ListNode head = lists[0];
        for(int i=1;i<lists.length;i++){
            head = merge(head,lists[i]);
        }
        return head;
    }
}
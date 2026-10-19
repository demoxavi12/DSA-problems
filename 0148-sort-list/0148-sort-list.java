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
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null)return l2;
        if(l2==null)return l1;
        
        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                res.next=l1;
                l1=l1.next;
            }
            else{
                res.next= l2;
                l2=l2.next;
            }
            res= res.next;
        }
        if(l1 != null)res.next=l1;
        else res.next = l2;

        return dummyNode.next;
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = findMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

       left= sortList(left);
       right=sortList(right);
       return merge(left,right);
    }
}
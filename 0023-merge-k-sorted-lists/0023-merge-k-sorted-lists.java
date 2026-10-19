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
    public ListNode convert(List<Integer> list){
        if(list.size()==0)return null;

        ListNode head = new ListNode(list.get(0));
        ListNode temp = head;
        for(int i=1;i<list.size();i++){
           ListNode newNode=new ListNode(list.get(i));
           temp.next=newNode;
           temp=newNode; 
        }
        return head;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> res= new ArrayList<>();

        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp != null){
                res.add(temp.val);
                temp=temp.next;
            }
        }
        res.sort(null);
        ListNode head = convert(res);
        return head;
    }
}
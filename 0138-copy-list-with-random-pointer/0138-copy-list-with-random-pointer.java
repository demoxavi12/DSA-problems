/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;

        Node temp = head;

        while(temp != null){
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp=copyNode.next;
        }

        temp=head;

        while(temp!=null){
           Node copyNode = temp.next;
            if(temp.random != null){

                copyNode.random = temp.random.next;
            }
            

            temp = copyNode.next;
        }
        temp = head;
        Node dummyNode = new Node(-1);
        Node res = dummyNode;

        while(temp != null){
            Node copyNode = temp.next;

            temp.next=copyNode.next;
            res.next=copyNode;

            res=res.next;
            temp=temp.next;
        }
        return dummyNode.next;
    }
}
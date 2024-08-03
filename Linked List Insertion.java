class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        
        // Node newNode = new Node(x);
        Node a=new Node(x);
        if(head==null){
            return a;
        }
        
        Node last=head;
        
        while(last.next!=null){
            last=last.next;
        }
        last.next=a;
        return head;
    }
}
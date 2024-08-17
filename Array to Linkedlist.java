class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node head=new Node(-1);
        Node tail=head;
        for(int i=0;i<arr.length;i++){
            Node Newnode=new Node(arr[i]);
            tail.next=Newnode;
            tail=Newnode;
        }
        head=head.next;
        return head;
    }
}

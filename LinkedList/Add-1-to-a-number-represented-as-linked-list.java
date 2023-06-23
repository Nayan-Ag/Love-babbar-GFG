// Ques: Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
// A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

// Input:
// LinkedList: 4->5->6
// Output: 457 

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).

// Code:
class Solution
{
    public static Node addOne(Node head) 
    { 
        if(head==null){
            return head;
        }
        head = reverse(head);
        if(head.data<9){
            head.data = head.data+1;
            return (reverse(head));
        }
        head.data = 0;
        Node curr = head.next;
        int carry = 1;
        while(curr!=null){
            if(curr.data==9 && carry==1){
                curr.data=0;
            }
            else{
                curr.data = curr.data + carry;
                carry = 0;
            }
            curr = curr.next;
        }
        head = reverse(head);
        if(carry==1){
            Node node= new Node(1);
            node.next = head;
            head = node;
        }
        return head;
    }
    public static Node reverse(Node head){
        Node c = head;
        Node curr = head.next;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = c;
            c = curr;
            curr = temp;
        }
        head.next = null;
        return c;
    }
}

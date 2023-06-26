// Ques: Given a linked list of N nodes. The task is to reverse this list.

// Input:
// LinkedList: 1->2->3->4->5->6
// Output: 6 5 4 3 2 1

// Explanation: After reversing the list, 
// elements are 6->5->4->3->2->1.

// Code:
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
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

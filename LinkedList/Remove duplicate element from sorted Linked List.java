// Ques: Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
// Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.

// Input:
// LinkedList: 2->2->4->5
// Output: 2 4 5
// Explanation: In the given linked list 
// 2 ->2 -> 4-> 5, only 2 occurs more 
// than 1 time.

// Expected Time Complexity : O(N)
// Expected Auxilliary Space : O(1)

// Code:
class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        if(head==null || head.next == null){
	       return head;
        }
        Node curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.data !=curr.next.data){
                curr = curr.next;
            }
            else{
             curr.next = curr.next.next;   
            }
        }
        return head;
	}
}

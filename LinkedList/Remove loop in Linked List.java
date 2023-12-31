// Ques: Given a linked list of N nodes such that it may contain a loop.

// A loop here means that the last node of the link list is connected to the node at position X(1-based index). If the link list does not have any loop, X=0.

// Remove the loop from the linked list, if it is present, i.e. unlink the last node which is forming the loop.

// Input:
// N = 3
// value[] = {1,3,4}
// X = 2
// Output: 1

// Explanation: The link list looks like
// 1 -> 3 -> 4
//     ^    |
//      |____|    
// A loop is present. If you remove it 
// successfully, the answer will be 1. 

// Expected time complexity: O(N)
// Expected auxiliary space: O(1)

// Code:
class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        HashSet<Node> set = new HashSet<>();
        Node curr = head;
        while(curr!=null){
            if(set.contains(curr.next)){
                Node temp = set.get(curr);
                temp.next = null;
            }
            set.add(curr.next);
            curr = curr.next;
        }
    }
}

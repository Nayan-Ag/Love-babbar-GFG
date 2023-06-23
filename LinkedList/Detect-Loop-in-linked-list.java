// Ques: Given a linked list of N nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.

// Input:
// N = 3
// value[] = {1,3,4}
// x(position at which tail is connected) = 2
// Output: True

// Explanation: In above test case N = 3.
// The linked list with nodes N = 3 is
// given. Then value of x=2 is given which
// means last node is connected with xth
// node of linked list. Therefore, there
// exists a loop.

// Code:
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        HashSet<Node> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head.next)){
                return true; 
            }
            set.add(head.next);
            head = head.next;
        }
        return false;
    }
}

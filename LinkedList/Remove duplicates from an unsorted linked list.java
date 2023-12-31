// Ques: Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.

// Input:
// N = 4
// value[] = {5,2,2,4}
// Output: 5 2 4

// Explanation:Given linked list elements are
// 5->2->2->4, in which 2 is repeated only.
// So, we will delete the extra repeated
// elements 2 from the linked list and the
// resultant linked list will contain 5->2->4

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

// Code:
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashSet<Integer> set = new HashSet<>();
         Node curr = head;
         Node dummy = null;
         Node dcurr = dummy;
         while(curr!=null){
             if(!set.contains(curr.data)){
                 Node node = new Node(curr.data);
                 if(dummy == null){
                     dummy = node;
                     dcurr = dummy;
                 }
                 else{
                    dcurr.next = node;
                    dcurr = dcurr.next;
                 }
             }
             set.add(curr.data);
             curr = curr.next;
         }
         return dummy;
    }
}

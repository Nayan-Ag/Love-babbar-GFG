//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public Stack<Integer> deleteMid(Stack<Integer> s,int sizeOfStack) 
    {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        int mid = sizeOfStack % 2 == 0 ? sizeOfStack/2 - 1 : sizeOfStack/2;
        for(int i=sizeOfStack-1;i>mid;i--)
            stack.push(s.pop());
        s.pop();
        while(!stack.isEmpty())
            s.push(stack.pop());
        return s;
    }
}


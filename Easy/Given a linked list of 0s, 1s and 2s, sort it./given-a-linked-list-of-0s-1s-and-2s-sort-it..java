//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        if(head==null || head.next==null) return head;
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            list.add(temp.data);
            temp = temp.next;
        }
        int i=0;
        int j = list.size()-1;
        while(i<=j){
            if(list.get(i)==0)i++;
            else if(list.get(j)==2 || list.get(j)==1)j--;
            else{
                int temps = list.get(i);
                list.set(i , list.get(j));
                list.set(j , temps);
                i++;
                j--;
            }
        }
        i=0;
        j=list.size()-1;
        while(i<=j){
            if(list.get(i)==0 || list.get(i)==1)i++;
            else if(list.get(j)==2)j--;
            else{
                int temps = list.get(i);
                list.set(i , list.get(j));
                list.set(j , temps);
                i++;
                j--;
            }
        }
        temp = head;
        for(int a=0 ; a<list.size();a++){
            temp.data = list.get(a);
            temp = temp.next;
        }
        return head;
    }
}



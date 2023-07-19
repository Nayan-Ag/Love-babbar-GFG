//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        StringBuilder s=new StringBuilder(S);
        s.reverse();
        String s1=new String(s);
        int size=S.length();
        int [][]arr=new int[size+1][size+1];
        for(int i=0;i<=size;i++)
        {
            arr[i][0]=0;
            arr[0][i]=0;
        }
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(s1.charAt(i-1)==S.charAt(j-1))
                {
                    arr[i][j]=1+arr[i-1][j-1];
                }
                else
                {
                    arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);
                }
            }
        }
        return arr[size][size];
    }
}
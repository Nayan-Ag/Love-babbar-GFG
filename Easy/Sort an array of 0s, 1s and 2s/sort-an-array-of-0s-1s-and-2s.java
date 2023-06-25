//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            if(a[end]==0 && a[start]!=0){
                int temp = a[start];
                a[start] = 0;
                a[end] = temp;
            }
            else if(a[start]==0) start++;
            else end--;
        }
        start = 0;
        end = a.length-1;
        while(start<=end){
            if(a[end]==1 && a[start]!=0 && a[start]!=1){
                int temp = a[start];
                a[start] = 1;
                a[end] = temp;
            }
            else if(a[start]==0 || a[start]==1) start++;
            else end--;
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends
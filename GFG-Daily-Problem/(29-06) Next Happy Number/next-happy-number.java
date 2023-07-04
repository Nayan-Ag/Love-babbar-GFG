//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    static int nextHappy(int N){
        for(int i =N+1; i<=100003; i++){
            if(isHappy(i)){
                return i;
            }
        }
        return 1;
    }
    
    static boolean isHappy(int N){
        if(N==1) {
            return true;
        }else if(N<=9 && N != 7 && N!= 1){
            return false;
        }
        return isHappy(digitSqSum(N));
    }
    
    static int digitSqSum(int N){
        int sum = 0;
        while(N>0){
            int d = N%10;
            sum+= d*d;
            N = N/10;
        }
        return sum;
    }
}
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
static long power(long x, long y, long p)
{
    long res = 1;
    x = x % p;
    while (y > 0) {
        if ((y & 1)!=0)
            res = (res * x) % p;
        y = y >> 1;
        x = (x * x) % p;
    }
    return res;
}
static long modInverse(long n, long p)
{
    return power(n, p - 2, p);
}
    static int nCr(int n, int r)
    {
        long M=1000000007,ans=0;
        long x=n,p1=1L,p2=1L;
        for(int i=1;i<=r;i++)
        {
            p1=(p1%M*(x--)%M)%M;
            p2=(p2%M*i%M)%M;
        }
        ans=((p1%M)*modInverse(p2,M)%M)%M;
        return (int)(ans%M);
        // code here
    }
}
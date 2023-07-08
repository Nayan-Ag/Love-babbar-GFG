//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            int a = 0;
            int b = n-1;
            
            while(a<b){
                if(a==i && b==i){
                    a++;b--;
                }
                else if(a==i)a++;
                else if(b==i)b--;
                else{
                    if(arr[a] + arr[b] + arr[i] == 0 ) return true;
                    else if(arr[a] + arr[b] + arr[i] < 0) a++;
                    else b--;
                }
            }
        }
        return false;
    }
}
import java.util.*;

public class palindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
       
        System.out.println(isPalindrome(arr, n));
    }

	public static boolean isPalindrome(int[] arr, int n) {
           // write your code here
            int res= isPalindromic(arr,0,n-1);
            if(res==1)
                return true;
            return false;
    }
    public static int isPalindromic(int arr[],int s,int e){
        if(s>e)
            return 1;
        if(arr[s]!=arr[e])
            return -1;
        return isPalindromic(arr,s+1,e-1);
    }

}

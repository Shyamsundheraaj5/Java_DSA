import java.util.*;


public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintReverseArray(arr, n);
    }

	public static void PrintReverseArray(int[] arr, int n) {
        //Write your code
        if(n==0) return;
        System.out.print(arr[n-1]+" ");
        PrintReverseArray(arr,n-1);
    }

  }

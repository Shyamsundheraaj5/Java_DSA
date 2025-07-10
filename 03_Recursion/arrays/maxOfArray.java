import java.io.*;
import java.util.Scanner;

public class maxOfArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        int result=maxElement(nums);
        System.out.print(result);
    }

    public static int maxElement(int[] arr){
      //Write your code here
       // base case
        if (arr.length == 1) {
            return arr[0];
        }

        // create a new array of size n-1
        int[] subArray = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            subArray[i] = arr[i];
        }

        // recursive call on smaller array
        int maxOfRest = maxElement(subArray);

        // compare last element with max of rest
        return Math.max(maxOfRest, arr[arr.length - 1]);
    }
}

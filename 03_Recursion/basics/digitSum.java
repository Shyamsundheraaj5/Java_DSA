import java.util.*;

public class digitSum {
    // Function to recursively calculate the sum of digits
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return sumOfDigits(n / 10) + (n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sumOfDigits(n);
        System.out.println(result);
        sc.close();
    }
}


import java.util.*;

public class factorial {

    public static long factorial_recursive(int n) {
        if (n == 0) return 1;
        return n * factorial_recursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial_recursive(n));
        sc.close();
    }
}


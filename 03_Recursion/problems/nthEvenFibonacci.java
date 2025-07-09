import java.util.*;

public class nthEvenFibonacci {
    static final long MOD = 1000000007;

    // Recursive function to get nth even Fibonacci number
    public static long nthEvenFibonacci(long n) {
        if (n == 1) return 2;
        if (n == 2) return 8;

        // E(n) = 4 * E(n - 1) + E(n - 2)
        return (4 * nthEvenFibonacci(n - 1) % MOD + nthEvenFibonacci(n - 2)) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(nthEvenFibonacci(n));
        sc.close();
    }
}


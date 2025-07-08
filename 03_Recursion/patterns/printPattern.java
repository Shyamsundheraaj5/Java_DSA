import java.util.*;

public class printPattern {

    public static void solve(int n) {
        if (n == 1) {
            System.out.print("*");
            return;
        }
        solve(n - 1);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
        sc.close();
    }
}


import java.util.*;

public class print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTillN(n);
        sc.close();
    }

    public static void printTillN(int n) {
        if (n == 0) return;
        printTillN(n - 1);
        System.out.print(n + " ");
    }
}


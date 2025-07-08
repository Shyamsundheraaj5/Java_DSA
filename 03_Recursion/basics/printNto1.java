import java.util.*;

public class printNTo1 {

    public static void printTill1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printTill1(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTill1(n);
        sc.close();
    }
}


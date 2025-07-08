import java.util.*;

public class productNatural {

    static long product(int n) {
        if (n == 1) return 1;
        return n * product(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(product(n));
        sc.close();
    }
}


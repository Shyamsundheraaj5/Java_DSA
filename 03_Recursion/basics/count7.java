import java.util.*;

public class count7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count7(n));
        sc.close();
    }

    public static int count7(int n) {
        if (n == 0) return 0;
        return count7(n / 10) + ((n % 10 == 7) ? 1 : 0);
    }
}


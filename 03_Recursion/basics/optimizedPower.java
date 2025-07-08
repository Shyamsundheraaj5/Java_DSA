import java.util.*;

public class optimizedPower {

    public static long power(int x, int y) {
        if (y == 0) return 1;
        long sub = power(x, y / 2);
        if (y % 2 == 0)
            return sub * sub;
        else
            return sub * sub * x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
        sc.close();
    }
}


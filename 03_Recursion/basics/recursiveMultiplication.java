import java.util.*;

public class recursiveMultiplication {

    public static int multiply(int n, int m) {
        if (m == 0) return 0;
        return n + multiply(n, m - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(multiply(n, m));
        scn.close();
    }
}


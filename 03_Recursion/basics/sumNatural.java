import java.util.*;

public class sumNatural {

    static long NumberSum(long N) {
        if (N == 0) return 0;
        return N + NumberSum(N - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(NumberSum(N));
        scanner.close();
    }
}


import java.io.*;
import java.util.Scanner;

class printAcciojob {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
        sc.close();
    }
    public static void solve(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("ACCIOJOB");
        solve(n - 1);
    }
}

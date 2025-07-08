import java.util.*;

public class printNTimes {

    static void printWord(int n) {
        if (n == 0) return;
        System.out.println("AccioSchool");
        printWord(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printWord(n);
        sc.close();
    }
}


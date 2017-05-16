import java.io.*;
import java.util.*;

public class Solution {

    private static boolean isPrime(int a) {
        int pom = (int) Math.sqrt(a);
        int i = 2;
        if (a <= 1) return false;
        while (i <= pom) {
            if (a%i == 0) return false;
            i++;
        }
        return true;

    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- > 0) {
            int n1 = in.nextInt();
            System.out.println(isPrime(n1) ? "Prime" : "Not prime");
        }
    }
}

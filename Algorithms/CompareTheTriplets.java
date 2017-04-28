import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] ab = new int[2];
        int A = 0;
        int B = 0;
        if (a0 > b0) A++;
        else if (a0 < b0) B++;
        if (a1 > b1) A++;
        else if (a1 < b1) B++;
        if (a2 > b2) A++;
        else if (a2 < b2) B++;
        ab[0] = A;
        ab[1] = B;
        return ab;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        String separator = "", delimiter = " ";
        for (Integer value : result) {
            System.out.print(separator + value);
            separator = delimiter;
        }
        System.out.println("");
        

    }
}

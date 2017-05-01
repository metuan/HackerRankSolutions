import java.io.*;
import java.util.*;

public class Main {

    private static char[] bin(int n) {
        String s = Integer.toBinaryString(n);
        char[] charArray = s.toCharArray();
        return charArray;
    }
    private static int consecutiveOne(char[] array) {
        int count = 0;
        int max = 0;
        for(int s: array){
            if(s=='1') count++;
            else if( count > max){
                max = count;
                count =0;
            }
            else count=0;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(consecutiveOne(bin(n)));
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static int getWays(int[] squares, int d, int m){
        int noWay = 0;
        for(int i=0; i <= (squares.length-m); i++){
            int tmpSum = squares[i];
            for(int j=i+1; j< i+m; j++){
                tmpSum += squares[j];
            }
            if(tmpSum == d) noWay++; 
        }
        return noWay;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}

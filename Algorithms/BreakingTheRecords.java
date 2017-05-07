import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        int high = s[0];
        int low = s[0];

        int highCount=0;
        int lowCount=0;

        for(int i=0; i<s.length; i++) {
            int current = s[i];
            if(high < current) {
                high = current;
                highCount++;
            }
            if(low > current) {
                low = current;
                lowCount++;
            }
        }
        int[] result = {highCount, lowCount};
        return result;        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "";
        String delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}

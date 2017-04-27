import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        String s = s1.next();
        int k = s1.nextInt();
        char[] ker = s.toCharArray();
        for (char c : ker) {
            int cn = (int) c;

            if( c >= 'A' && c <= 'Z'){
                cn = 'A' + (cn - 'A' + k) % 26;
            } else if(c >= 'a' && c <= 'z'){
                cn = 'a' + (cn - 'a' + k) % 26;
            }

            System.out.print((char)cn);
        }
    }
}

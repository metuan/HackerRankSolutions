import java.io.*;
import java.util.*;

public class Solution {
    static String reduce(String s) {
        while(s.matches(".*?([a-z])\\1.*")) {
            s = s.replaceAll("([a-z])\\1", "");
        }
        return s.isEmpty() ? "Empty String" : s;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String sss = s1.nextLine();
        System.out.println(reduce(sss));
    }
}

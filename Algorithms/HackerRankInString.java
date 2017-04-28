import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        List<String> anserwers = new LinkedList<>();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            if(s.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*")) anserwers.add("YES");
            else anserwers.add("NO");
        }
        anserwers.forEach(System.out::println);
    }
}

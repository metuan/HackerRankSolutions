import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int i1;
        double d1;
        String s1;

        i1 = scan.nextInt();
        d1 = scan.nextDouble();
        scan.nextLine();
        s1 = scan.nextLine();


        System.out.println(i1 + i);
        System.out.println(d1 + d);
        System.out.println(s + s1);
        
                scan.close();
    }
}

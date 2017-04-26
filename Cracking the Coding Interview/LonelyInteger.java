import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[101];
        int liczbaDoPowtorzenia = -1;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            b[a[a_i]] += 1;
        }
        int minimum = 101;
        int index = 0;
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] == 0) continue;
            else if (b[i] < minimum){
                minimum = b[i] ;
                index = i;
            }
        }
        System.out.println(index);
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int value = s1.nextInt();
        int size = s1.nextInt();
        int iterator = 0;
        for (int i = 0; i < size; i++) {
            int a = s1.nextInt();
            if (a == value) break;
            iterator++;
        }
        System.out.println(iterator);
    }
}

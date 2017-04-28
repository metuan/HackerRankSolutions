import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int numberOfTheTallestCandle = 0;
        int maximumHeight = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        for (int element : height) {
            if (element > maximumHeight) {
                maximumHeight = element;
                numberOfTheTallestCandle = 1;
            }
            else if (element == maximumHeight) {
                numberOfTheTallestCandle = numberOfTheTallestCandle + 1;
            }
        }
        System.out.println(numberOfTheTallestCandle);
    }
}

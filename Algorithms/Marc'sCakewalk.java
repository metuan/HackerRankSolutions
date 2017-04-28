import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] calories = new Integer[n];
        long sumOfCalories = 0;
        int iterator = 0;
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories, Collections.reverseOrder());
        for (Integer e :
                calories) {
            sumOfCalories += e*(Math.pow(2,iterator));
            iterator++;
        }
        System.out.println(sumOfCalories);
    }
}

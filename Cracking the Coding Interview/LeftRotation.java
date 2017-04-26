import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int shift_value = in.nextInt();
        int a[] = new int[size];
        if(size==shift_value){   
            for(int a_i=0; a_i < size; a_i++)
                a[a_i] = in.nextInt();
            for(int val : arr) 
                System.out.print(val+" ")
        }
        else{
            for(int a_i=0; a_i < size; a_i++)
                a[(a_i+(size-shift_value))%size] = in.nextInt();
            for(int val : arr) 
                System.out.print(val+" ");
        }      
    }
}

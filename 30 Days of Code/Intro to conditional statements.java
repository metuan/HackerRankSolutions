import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
       if(n%2==1 || (n%2==0 && n<=20 && n>=6)) {
         ans = "Weird";
      }
      else{
         ans = "Not Weird";
      }
      System.out.println(ans);
   }
}

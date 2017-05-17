import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Main
{

  int gcd(int m,int n) {
      if(n==0) return m;
      else return gcd(n,m%n);
  }

  int lcm(int[] a,int n){
      int res =1,i;
      for (i=0;i<n;i++) {
          res =res*a[i]/gcd(res,a[i]);
      }
      return res;
  }


  public static void main(String[] args) {
      Main ob = new Main();
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int m = scan.nextInt();

      int[] a = new int[n]; 
      int[] b = new int[m];
      for (int i=0;i<n;i++) {
          a[i] = scan.nextInt();
      } 
      int result = ob.lcm(a,n);
      int result2=1;
      for (int i=0;i<m;i++) {
          int r =1;
          b[i] = scan.nextInt();
      }
      int no =b[0];
      for(int i=1;i<m;i++) {
          no=ob.gcd(no,b[i]);
      }
      int count = 0;
      int f = result;
      int l = no; 
      for (int i=f;i<=l;i+=f) {
          if(l%i==0) count++;
      }
      System.out.println(count);
  }
}

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        // quick and simple solution  
        IntStream.range(1, arr.length + 1).boxed().mapToInt(i -> arr[arr.length - i]).forEach(i1 -> System.out.print(i1 + " "));
    }
}

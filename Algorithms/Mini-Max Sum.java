import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] arr = {a,b,c,d,e};
        
        long max = 0;
        long min = 0;
        
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(i > 0){
                max += arr[i];
            }
            if(i <= arr.length - 2){
                min += arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}

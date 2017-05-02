import java.util.*;

public class Main {
    private static int hourGlass(int[][] arr) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i = 0; i < (arr.length  / 2) + 1 ; i++){
            for(int j = 0; j < (arr.length  / 2) + 1; j++){
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+ arr[i+2][j+2];
                if(sum>max)
                    max=sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(hourGlass(arr));
    }
}

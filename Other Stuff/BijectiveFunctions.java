import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfArguments = sc.nextInt();
        int[] input = new int[numberOfArguments];

        for (int i = 0; i < numberOfArguments; i++) {
            input[i] = sc.nextInt();
        }

        int count = 0;
        Arrays.sort(input);

        int j = 0;
        while (j < numberOfArguments) {
            if (input[j] != j+1 ) {
                count++;
                break;
            }
            j++;
        }

        System.out.println((count == 0) ? "YES" : "NO");
    }
}

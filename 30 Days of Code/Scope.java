import java.util.Arrays;
import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;
    public Difference(int[] elementCompute) {
        this.elements = elementCompute;
    }
    public void computeDifference() {
        Arrays.sort(elements);
        this.maximumDifference = elements[elements.length - 1] - elements[0];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}

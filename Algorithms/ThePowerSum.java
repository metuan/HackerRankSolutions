import java.util.*;

public class Main {

    private static int biggestPowInNum(int numberToFindPower, int nthBase, int currentBase) {
        int currentPow = (int) Math.pow(currentBase, nthBase);
        if (currentPow == numberToFindPower)
            return 1;
        else if (currentPow > numberToFindPower )
            return 0;
        return biggestPowInNum(numberToFindPower, nthBase, currentBase+1) +
                biggestPowInNum(numberToFindPower - currentPow, nthBase, currentBase+1);
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(biggestPowInNum(n,m,1));
    }
}

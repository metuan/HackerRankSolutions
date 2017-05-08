import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();
        ArrayList<BigInteger> storeOfValues = new ArrayList<>(numberOfTests);
        while (numberOfTests-- > 0) {
            BigInteger numberToProceed = in.nextBigInteger();
            numberToProceed=((numberToProceed.mod(BigInteger.valueOf(1000000007))).multiply(numberToProceed.mod(BigInteger.valueOf(1000000007)))).mod(BigInteger.valueOf(1000000007));
            storeOfValues.add(numberToProceed);
        }
        storeOfValues.forEach(i -> System.out.println(i));
    }
}

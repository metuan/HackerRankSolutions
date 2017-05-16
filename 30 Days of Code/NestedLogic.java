import java.util.Scanner;

public class Main {

    private static int d1, m1, y1, d2, m2, y2, dayfine, monthFine, yearFine;

    private static void readData() {
        Scanner in = new Scanner(System.in);
        d1 = in.nextInt();
        m1 = in.nextInt();
        y1 = in.nextInt();
        d2 = in.nextInt();
        m2 = in.nextInt();
        y2 = in.nextInt();
        in.close();
        dayfine = d1 - d2;
        monthFine = m1 - m2;
        yearFine = y1 - y2;
    }

    public static void main(String[] args) {
        readData();
        if ((dayfine <= 0 && monthFine <= 0 && yearFine <= 0) || yearFine < 0) System.out.println(0);
        else if (dayfine > 0 && monthFine == 0 && yearFine == 0) System.out.println(15*dayfine);
        else if (monthFine > 0 && yearFine == 0) System.out.println(500*monthFine);
        else if ((dayfine != 0 || monthFine != 0) && yearFine > 0) System.out.println(10000);
    }
}

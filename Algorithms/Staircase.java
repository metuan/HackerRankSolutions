import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner toGetNumber = new Scanner(System.in);
        int numberOfElementsToPrint = toGetNumber.nextInt();
        int nHelp = numberOfElementsToPrint;
        for (int i = 0; i < numberOfElementsToPrint; i++) {
            for (int j = 0; j < nHelp - 1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
            nHelp = nHelp - 1;
        }
    }
    
}

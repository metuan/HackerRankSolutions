import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner k1 = new Scanner(System.in);
        int numberOfTests = k1.nextInt();
        String[] contenerOfString = new String[numberOfTests];
        int iterator = 0;
        while (numberOfTests-- > 0){
            String word = k1.next();
            String oddLetters = "";
            String evenLetters = "";
            for (int i = 0; i <  word.length(); i++) {
                if (i%2 == 0) {
                    evenLetters += word.charAt(i);
                }
                else {
                    oddLetters += word.charAt(i);
                }
            }
            String wordToShow = evenLetters + " " + oddLetters;
            contenerOfString[iterator] = wordToShow;
            iterator++;
        }
        for (String e : contenerOfString) {
            System.out.println(e);
        }
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.toLowerCase().chars().filter(element -> element >= 'a' && element <= 'z').distinct().count() == 26)
            System.out.println("pangram");
        else System.out.println("not pangram");
    }
}

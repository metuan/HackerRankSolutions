import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] chunk = time.split(":");
        int hour = Integer.parseInt(chunk[0]);
        if( chunk[chunk.length-1].endsWith("PM") ) hour += 12;
        if( hour == 24 || hour == 12 ) hour -= 12;
        System.out.format("%S:%S:%S",
                (hour<10)?"0"+hour:hour,
                chunk[1],
                chunk[2].substring(0, 2));
    }
}

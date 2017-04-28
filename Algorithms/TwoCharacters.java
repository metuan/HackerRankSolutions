import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        
        HashMap<Integer,Character> map = new HashMap();
        
        int index = 0;
        Set<Character> set = new HashSet();
        
        for(char c : s.toCharArray()) {
            if(!set.contains(c)){
                map.put(index ++,c);
                set.add(c);
            }
        }
        int charNumber = set.size();
        int max = 0;
        
        String invalid = "(\\w)\\1";
        Pattern pInvalid = Pattern.compile(invalid);
        
        for(int i = 0; i < charNumber - 1; i ++) {
            for(int j = i + 1; j < charNumber; j ++) {
                char first = map.get(i);
                char second = map.get(j);
                String pattern = "[^" + first +""+ second +"]";
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(s);
                String ret = m.replaceAll("");
                Matcher mInvalid = pInvalid.matcher(ret);
                if(!mInvalid.find()) {
                    max = ret.length() > max ? ret.length() : max;
                }

 
            }
        }
        System.out.println(max);
    }
}

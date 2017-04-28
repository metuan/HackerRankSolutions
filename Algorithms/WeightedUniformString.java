import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static Set<Integer> getWeights(String s){
        Set<Integer> set=new HashSet();
        Matcher m = Pattern.compile("(\\w)\\1*").matcher(s);
        while(m.find()){
            String sub=m.group(0);
            int weight=0;
            for(char c:sub.toCharArray()){
                weight+=((int)c)-96;
                set.add(weight);
            }
        }
        return set;
    }

    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
            String s=in.next();
            int n=in.nextInt();
            Set<Integer> weights=getWeights(s);
            List<String> answers = new LinkedList<>();
            for(int a0=0;a0<n; a0++){
                int x=in.nextInt();
                String msg=weights.contains(x)?"Yes":"No";
                answers.add(msg);
            }
        answers.forEach(System.out::println);
    }
}

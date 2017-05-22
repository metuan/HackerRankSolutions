import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static String emailRegEx = ".+@gmail\\.com$";
    private static Pattern pattern = Pattern.compile(emailRegEx);
    private static ArrayList<String> gmailAdresses = new ArrayList<>();
    private static void isFound(String email, String name) {
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            gmailAdresses.add(name);
        }
    }
    private static void sortToOutput(ArrayList<String> listWithAdresses) {
        Collections.sort(listWithAdresses);
        listWithAdresses.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++){
            String name = scanner.next();
            String email = scanner.next();
            isFound(email, name);
        }
        sortToOutput(gmailAdresses);
    }
}

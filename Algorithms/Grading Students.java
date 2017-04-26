import java.util.*;

public class Main{
    static void solve (int[] grades){
        for (int gradeOfStudent : grades) {
            int differnce = ((gradeOfStudent + (5 - gradeOfStudent % 5)) - gradeOfStudent);
            if (gradeOfStudent < 38) System.out.println(gradeOfStudent);
            else if (differnce < 3) System.out.println(gradeOfStudent+differnce);
            else System.out.println(gradeOfStudent);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        solve(grades);
    }
}

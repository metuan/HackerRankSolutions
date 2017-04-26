import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextInt(); // tip percentage
        double taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double costWithTip = tipPercent/100 * mealCost;
        double costWithTax = taxPercent/100 * mealCost;
        double totalCostOfMeal = costWithTax + costWithTip +  mealCost;
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(totalCostOfMeal);

        System.out.println("The total meal cost is " + Integer.toString(totalCost)+ " dollars.");
    }
}

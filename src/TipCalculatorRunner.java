/* Hans de los Santos
Tip Calculator: Refactored Project
Tip Calculator Runner Class
Periods 5-6 APCSA with Mr. Miller */

// import pre-packaged classes
import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        // assign usable variables to pre-packaged classes
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        // welcome the user, line 1 of output
        System.out.println("Welcome to the tip calculator!");

        // store the number of people at the table, line 2 of output
        System.out.print("How many people are in your group? ");
        int people = scan.nextInt();
        scan.nextLine();

        // create a TipCalculator object using the people defined above and the user input for tip percentage below, line 3 of output
        System.out.print("What's the tip percentage? (0 - 100): ");
        TipCalculator calc = new TipCalculator(people, scan.nextInt());
        scan.nextLine();

        // store the bill before tip as the sum of all items inputted, "line 4" of output
        double itemCost = 0;
        while (itemCost != -1) {
            calc.addMeal(itemCost);
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            itemCost = scan.nextDouble();
            scan.nextLine();
        }

        // final output, calculating values with the TipCalculator and rounding before printing, lines 5-12 of output
        System.out.println("---------------------------");
        System.out.println("Total Bill Before Tip: " + calc.getTotalBillBeforeTip());
        System.out.println("Tip Percentage: " + calc.getTipPercentage());
        System.out.println("Total Tip: " + formatter.format(calc.tipAmount()));
        System.out.println("Total Bill With Tip: " + formatter.format(calc.totalBill()));
        System.out.println("Per Person Cost Before Tip: " + formatter.format(calc.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: " + formatter.format(calc.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: " + formatter.format(calc.perPersonTotalCost()));
    }
}

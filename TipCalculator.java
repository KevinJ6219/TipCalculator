import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Declaring Variables Needed
        double bill;
        double tipPercent;
        double tipTotal;
        double tipPerPerson;
        int people;
        double totalPerPerson;
        double totalBillWithTip;

        //Asking for user input
        System.out.print("How much was your bill: ");
        bill = input.nextDouble();
        System.out.print("What is the tip percentage(Whole Number): ");
        tipPercent = input.nextDouble() / 100;
        System.out.print("How many people were there: ");
        people = input.nextInt();

        //Calculate new information that will be printed out
        tipTotal = bill * tipPercent;
        tipPerPerson = tipTotal / people;
        totalBillWithTip = bill + tipTotal;
        totalPerPerson = totalBillWithTip / people;

        //Print our Information
        DecimalFormat dFormatter = new DecimalFormat("##.##");
        System.out.println("Total Tip Amount: " + dFormatter.format(tipTotal));
        System.out.println("Tip Paid Per Person: " + dFormatter.format(tipPerPerson));
        System.out.println("The Total Bill Including Tip: " + dFormatter.format(totalBillWithTip));
        System.out.println("Total Paid Per Person: " + dFormatter.format(totalPerPerson));

    }
}

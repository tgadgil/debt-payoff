import java.util.ArrayList;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //how many credit cards?

        //make Apr ArrayList

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }
    }
}

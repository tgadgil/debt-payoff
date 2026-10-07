import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        // CreditCard costco = new CreditCard("Costco Visa", 20.33, 300);
        // costco.setName("Visa Gold");
        // System.out.println(costco.getName());
        // System.out.println(target.getName());

        // make empty Apr ArrayList
        ArrayList<Double> aprs = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // add apr to arraylist
            aprs.add(apr);

            // Consume \n after balance input
            if(scan.hasNextLine()) scan.nextLine();

            CreditCard card = new CreditCard(name, apr, balance);
            System.out.println(card);

            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        Collections.sort(aprs, Comparator.reverseOrder());
        System.out.println(aprs);
    }
}
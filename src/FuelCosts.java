import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double price = 0;

        while (true) {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                break;
            }
            else {
                in.next();
                System.out.println("Your input is invalid. Please enter a valid number.");
            }
        }

        while (true) {
            System.out.print("Enter the fuel in miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                break;
            }
            else {
                in.next();
                System.out.println("Your input is invalid. Please enter a valid number.");
            }
        }

        while (true) {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                break;
            }
            else {
                in.next();
                System.out.println("Your input is invalid. Please enter a valid number.");
            }
        }

        double cost = (100 / mpg) * price;
        double distance = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + cost);
        System.out.println("Distance car can go: " + distance + " miles");

    }
}


import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean done = false;

        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                done = true;
            }
            else {
                in.next();
                System.out.println("Please, enter a valid number.");
            }
        }
        while (!done);

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit + "°F");

    }
}

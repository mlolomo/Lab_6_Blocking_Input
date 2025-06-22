import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;

        while (true) {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                break;
            }
            else {
                in.next();
                System.out.println("Your input is invalid. Please enter a valid number.");
            }
        }

        while (true) {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                break;
            }
            else {
                in.next();
                System.out.println("Your input is invalid. Please enter a valid number.");
            }
        }

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The length of the diagonal is: " + diagonal);
    }
}
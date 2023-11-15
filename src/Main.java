import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempC;
        double tempF;
        boolean validOutput = false;

        System.out.println("Please enter a temperature in degrees C to be converted to degrees F: ");
        do {
            if (scan.hasNextDouble()) {
                tempC = scan.nextDouble();
                tempF = (tempC * (9 / 5) + 32);
                System.out.printf("\nDegrees C: %-5.2f", tempC);
                System.out.printf("\nDegrees F: %-5.2f", tempF);
            } else {
                scan.nextLine();
                System.out.println("You have entered an invalid temperature value. Please try again");
            }
        } while (!validOutput);
    }
}
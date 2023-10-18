import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's weight in kilograms.
        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();

        // Get the user's height in meters.
        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();

        // Calculate the user's BMI.
        double bmi = weight / (height * height);

        // Print the user's BMI.
        System.out.println("Your BMI is: " + bmi);

        // Determine the user's BMI category.
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are at a healthy weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
            scanner.close();
        }
    }
}
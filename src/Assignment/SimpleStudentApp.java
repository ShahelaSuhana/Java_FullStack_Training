package Assignment;
import java.util.Scanner;

public class SimpleStudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read Inputs
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        float weight = sc.nextFloat();

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        // 2. Compute BMI
        double bmi = weight / (height*height);

        // 3. Determine BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // 4. Print results
        System.out.println("Your name is " + name);
        System.out.printf("Your BMI is %.2f (%s)%n", bmi, category);

        // 5. Minor or Adult
        if (age < 18) {
            System.out.println("You are Minor");
        } else {
            System.out.println("You are Adult");
        }

        // 6. Ternary operator for pass/fail
        String result = (gpa >= 2.5) ? "Pass" : "Fail";
        System.out.println("Result " + result);

        // 7. Close scanner
        sc.close();
    }
}

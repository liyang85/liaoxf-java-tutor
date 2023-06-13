import java.util.Scanner;

public class TestIfExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Input your height (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("体重偏低");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("体重正常");
        } else if (bmi >= 25 && bmi < 28) {
            System.out.println("体重过重");
        } else if (bmi >= 28 && bmi < 32) {
            System.out.println("体重肥胖");
        } else {
            System.out.println("体重非常肥胖");
        }
    }
}

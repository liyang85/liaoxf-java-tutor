import java.util.Scanner;

public class TestInputExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the last test score: ");
        int lastScore = scanner.nextInt();

        System.out.print("Input current test score: ");
        int currentScore = scanner.nextInt();

        double changePercent = (double) (currentScore - lastScore) / lastScore;
        System.out.println(changePercent);
        System.out.printf("\nThe change percent is: %.2f%%.\n", changePercent * 100);
    }
}

import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = scanner.nextLine();

        System.out.print("Input your age: ");
        int age = scanner.nextInt();

        System.out.printf("\nHi, %s, you are %d.\n", name, age);
    }
}

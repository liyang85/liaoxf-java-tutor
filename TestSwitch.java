import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your option (1, 2, 3): ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Selected option 1.");
                break;
            case 2:
                System.out.println("Selected option 2.");
                break;
            case 3:
                System.out.println("Selected option 3.");
                break;
            default:
                System.out.println("No option selected.");
                break;
        }
    }
}

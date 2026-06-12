// The 'Student Grade Filter' (ArrayList & Conditionals)
import java.util.Scanner;
public class StudentGradeFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("=== Grade Checker ===");

        while (true) {

            System.out.print("Enter score (or 'stop' to quit): ");
            input = scanner.nextLine();

            if (input.equals("stop")) {
                System.out.println("Goodbye!");
                break;
            }

            int score = Integer.parseInt(input);

            if (score >= 90) {
                System.out.println("Result: Distinction");
            } else if (score >= 40) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }

        }

        scanner.close();
    }
}
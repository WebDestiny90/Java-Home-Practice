import java.util.Scanner;

public class WhileScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int firstNumber;
    int secondNumber;

    while (true) {
      System.out.println("Enter two numbers:");

      if (scanner.hasNextInt()) {
        firstNumber = scanner.nextInt();
      } else {
        System.out.println("Invalid input! Please enter a number.");
        scanner.next();
        continue;
      }

      if (scanner.hasNextInt()) {
        secondNumber = scanner.nextInt();
      } else {
        System.out.println("Invalid input! Please enter a number.");
        scanner.next();
        continue;
      }

      break;
    }

    System.out.println(firstNumber + " " + secondNumber);
  }
}

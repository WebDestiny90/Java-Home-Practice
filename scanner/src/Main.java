import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter First Number:");
    int userFirstNumber = scanner.nextInt();

    System.out.println("Enter Second Number:");
    int userSecondNumber = scanner.nextInt();

    System.out.println("First Number: " + userFirstNumber+ " " + "Second Number: " + userSecondNumber);

    scanner.close();
  }
}
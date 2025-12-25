import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter First Number: ");
    int firstNumber = scanner.nextInt();
    System.out.println("Enter Operator: ");
    String operator = scanner.next();
    System.out.println("Enter Second Number: ");
    int secondNumber = scanner.nextInt();

    Calc calc = new Calc();

    calc.MyCalc(firstNumber, secondNumber, operator);

    Customer customer = new Customer();
    customer.CustomerMethod();
    customer.CustomerSecondMethod();
   String name = customer.CustomerName("Taleh");
    System.out.println(name);
  }
}
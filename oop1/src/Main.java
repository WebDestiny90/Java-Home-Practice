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


    Animal obj1 = new Animal();

    obj1.firstMethod();
    obj1.secondMethod();

    Calc calc = new Calc();

    calc.calc(firstNumber,secondNumber,operator);

    Human human = new Human();

    human.jason();
  }
}
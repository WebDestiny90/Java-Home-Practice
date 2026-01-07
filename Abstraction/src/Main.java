import Abstract.Multiplication;
import Abstract.Sum;

public class Main {
  public static void main(String[] args) {
    Human human = new Human();
    human.sayHi();

    Multiplication multiplication = new Multiplication();
    System.out.println( multiplication.calc(2,2));

    Sum sum = new Sum();
    System.out.println(sum.calc(5,5));

    System.out.println(AnimalClass.name);
    AnimalClass.staticMethod();

    System.out.println(Sport.name);
  }
}
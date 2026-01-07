public class AnimalClass extends AbstractClass{
  @Override
  public void printScreen() {
    System.out.println("Animal Class");
  }

  public static String name = "Cat";

  public static void staticMethod() {
    System.out.println("This Static method of " + name);
  }
}

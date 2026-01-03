public class Dog extends Animal {
  public void bark() {
    System.out.println("Hav hav");
  }

  @Override
  public void sound() {
    super.sound();
    System.out.println("i have specific sound");
  }

}

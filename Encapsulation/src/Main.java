import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Human human = new Human();

//    String name = human.sayHi("Destiny");
//    System.out.println(name);

    int[] myArr = {2,4,6,8,10,12,14,5,7,9,3};

    int[] response = human.returnEvenArray(myArr);

    human.printScreen(response);

  }
}
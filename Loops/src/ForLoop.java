public class ForLoop {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println("i= " + i);
    }

    for (int i = 5; i >= 1; i--) {
      System.out.println("i= " + i);
    }

    for (int i = 1; i<=5; i++) {
      System.out.println("i= " + i);
      for (int j = 1; j<=10; j++){
        System.out.println("j= " + j);
      }
    }

    for (int i = 40; i >= 0; i--) {
      if (i %2 == 0) {
        System.out.println(i);
      }
    }

    for (int i = 100; i>=0; i-=2) {
      System.out.println("i= " + i);
    }
  }
}

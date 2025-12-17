public class WhileLoop {
  public static void main(String[] args) {
    int i = 1;

    while (i <=10) {
      System.out.println(i);
      i++;
    }

    int b = 10;

    while (b >= 1) {
      System.out.println(b);
      b--;
    }

    int j = 1;

    do {
      j++;
    }while (j<=10);
    System.out.println("j= " + j);
  }
}
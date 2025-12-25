public class Calc {
  public void calc(int a, int b, String c) {
//    if (c.equals("+")) {
//      System.out.println(a + b);
//    } else if (c.equals("-")) {
//      System.out.println(a - b);
//    } else if (c.equals("*")) {
//      System.out.println(a * b);
//    } else if (c.equals("/")) {
//      System.out.println(a / b);
//    }else {
//      System.err.println("wrong operator!!!");
//    }

//    switch (c) {
//      case "+":
//        System.out.println(a + b);
//        break;
//      case "-":
//        System.out.println(a - b);
//        break;
//      case "*":
//        System.out.println(a * b);
//        break;
//      case "/":
//        System.out.println(a / b);
//        break;
//      default:
//        System.err.println("Wrong Operator!!!");
//    }

    switch (c) {
      case "+" -> System.out.println(a+b);
      case "-" -> System.out.println(a-b);
      case "*" -> System.out.println(a*b);
      case "/" -> System.out.println(a/b);
      default -> System.err.println("Wrong Operator!!!");
    }
  }
}

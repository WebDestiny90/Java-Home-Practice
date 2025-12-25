public class Calc {
  public void MyCalc(int a, int b, String c) {
//        if (c.equals("+")) {
//          System.out.println(a + b);
//        } else if (c.equals("-")) {
//          System.out.println(a - b);
//        } else if (c.equals("*")) {
//          System.out.println(a * b);
//        } else if (c.equals("/")) {
//          System.out.println(a / b);
//        } else {
//          System.out.println("Wrong Operator!!!");
//        }
//
//        switch (c) {
//          case "+":
//            System.out.println(a + b);
//            break;
//          case "-":
//            System.out.println(a - b);
//            break;
//          case "*":
//            System.out.println(a * b);
//            break;
//          case "/":
//            System.out.println(a / b);
//            break;
//          default:
//            System.out.println("Wrong Operator!!!");
//        }

    switch (c) {
      case "+" -> System.out.println(a + b);
      case "-" -> System.out.println(a - b);
      case "*" -> System.out.println(a * b);
      case "/" -> System.out.println(a / b);
      default -> System.out.println("Wrong Operator!!!");
    }
  }
}
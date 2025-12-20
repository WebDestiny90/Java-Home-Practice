import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
//    int[][] myFirstArray = {{5,78,95,14,56}, {4,8,9,65,15,78}};
//   System.out.println((myFirstArray[2][4]));
//
//    for (int i = 0; i < myFirstArray.length; i++) {
//      System.out.println(Arrays.toString(myFirstArray[i]));
//
//    }
//
//    int[] myArray = new int[5];
//    myArray[0] = 1;
//    myArray[1] = 2;
//    myArray[2] = 3;
//    myArray[3] = 4;
//    myArray[4] = 5;
//    System.out.println(Arrays.toString(myArray));

    int[] arraySum = {52,85,68,95};
    int sum = 0;
    for (int i = 0; i < arraySum.length; i++) {
      sum+=arraySum[i];
    }
    System.out.println(sum);

  }
}
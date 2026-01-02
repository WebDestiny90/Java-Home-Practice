import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
//    int[][] myFirstArray = {{5,78,95,14,56}, {4,8,9,65,15,78}};
//   System.out.println((myFirstArray[1][4]));
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
//
//    int[] arraySum = {52,85,68,95};
//    int sum = 0;
//    for (int i = 0; i < arraySum.length; i++) {
//      sum+=arraySum[i];
//    }
//    System.out.println(sum);

    int[] myReversedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//    for (int i = myReversedArray.length-1; i >=0; i--) {
//      System.out.print(myReversedArray[i]+ " ");
//    }
//
//    int[][] reversedArray = {{52, 45, 87, 96, 78}, {405, 58, 96, 25, 55}};
//
//    for (int i = reversedArray.length - 1; i >= 0; i--) {
//      for (int j = reversedArray[i].length - 1; j >= 0; j--) {
//        System.out.print(reversedArray[i][j] + " ");
//      }
//    }

    MyArray myArray1 = new MyArray();

   var myArrayList = myArray1.myList(myReversedArray);


    for (int i = 0; i<myReversedArray.length; i++) {
      System.out.println(myArrayList[i]);
    }
    Human human = new Human();

    //    String name = human.sayHi("Destiny");
    //    System.out.println(name);

    int[] myArr = {2,4,6,8,10,12,14,5,7,9,3};

    int[] response = human.returnEvenArray(myArr);

    human.printScreen(response);
  }
}
public class Human {
  public String sayHi(String name) {
    return "Hello " + name;
  }

  public int countEvenNumbers(int[] intArray) {
    int countEvenNumbers = 0;
    for (int i = 0; i<intArray.length; i++) {
      if (intArray[i] % 2 == 0) {
        countEvenNumbers++;
      }
    }
    return countEvenNumbers;
  }

  public int[] returnEvenArray(int[] intArray) {
    int evenArrayIndex = 0;
    int[] evenArray = new int[countEvenNumbers(intArray)];
    for (int i = 0; i<intArray.length; i++) {
      if (intArray[i] %2 == 0) {
        evenArray[evenArrayIndex] = intArray[i];
        evenArrayIndex++;
      }
    }
    return evenArray;
  }

  public void printScreen(int[] response) {
    for (int i = 0; i < response.length; i++) {
      System.out.println(response[i]);
    }
  }
}

public class Human {

//  private void sayHi(String name) {
//    System.out.println("Hi " + name);
//  }
//
//  private void sayBye(String name) {
//    System.out.println("Bye " + name);
//  }
//
//  public void reception(String name) {
//    sayHi(name);
//    sayBye(name);
//  }

  public String firstName;
  public String lastName;
  public int age;
  public boolean gender;

  public Human(String firstName, String lastName, int age, boolean gender) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
  }

  public Human() {
  }

  public String genderCheck(boolean gender) {
    if (gender) {
      return "Woman";
    }
    return "Man";
  }

  @Override
  public String toString() {
    return "Human{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", gender=" + gender + '}';
  }
}

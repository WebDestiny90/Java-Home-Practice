public class Customer {
  public Customer() {
    System.out.println("Constructor Customer:");
  }

  public void CustomerMethod() {
    System.out.println("Taleh");
  }

  public void CustomerSecondMethod() {
    CustomerMethod();
  }

  public String CustomerName(String name) {
    return name;
  }
}

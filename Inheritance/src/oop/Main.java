package oop;

public class Main {
  public static void main(String[] args) {
    GrandParent grandParent = new GrandParent();
    grandParent.firstName = "Michael";
    grandParent.surName = "Brown";
    grandParent.age = 70;
    System.out.println(grandParent);

    Parent parent = new Parent();
    parent.firstName = "David";
    parent.surName = "Brown";
    parent.age = 39;
    parent.valideyn = "Michael";

    System.out.println(parent);

    Child child = new Child();
    child.firstName = "Daniel";
    child.surName = "Brown";
    child.age = 5;
    child.valideyn = "David";
    System.out.println(child);
  }
}

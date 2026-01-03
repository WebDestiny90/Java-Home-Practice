package oop;

public class Child extends Parent{
  public String firstName;
  public String surName;
  public int age;
  public String valideyn;

  @Override
  public String toString() {
    return "Child{" + "firstName='" + firstName + '\'' + ", surName='" + surName + '\'' + ", age=" + age + ", valideyn='" + valideyn + '\'' + '}';
  }
}

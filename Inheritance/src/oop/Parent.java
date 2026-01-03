package oop;

public class Parent extends GrandParent{
  public String firstName;
  public String surName;
  public int age;
  public String valideyn;

  @Override
  public String toString() {
    return "Parent{" + "firstName='" + firstName + '\'' + ", surName='" + surName + '\'' + ", age=" + age + ", valideyn='" + valideyn + '\'' + '}';
  }
}

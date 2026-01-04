package hobbies;

import java.time.LocalDate;
import java.util.Arrays;

public class Human {
  private String firstName;
  private String lastName;
  private LocalDate dbo;
  private Hobby[] hobbies;
  private Sport sport;

  public Human() {
  }

  public String calc(int a, int b) {
    int c = a+b;
    return c > 0 ? "c is positive" : "c is negative";
  }

  public Human(String firstName, String lastName, LocalDate dbo, Hobby[] hobbies, Sport sport) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dbo = dbo;
    this.hobbies = hobbies;
    this.sport = sport;
  }

  @Override
  public String toString() {
    return "Human{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", dbo=" + dbo + ", hobbies=" + Arrays.toString(hobbies) + ", sport=" + sport + '}';
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getDbo() {
    return dbo;
  }

  public void setDbo(LocalDate dbo) {
    this.dbo = dbo;
  }

  public Hobby[] getHobbies() {
    return hobbies;
  }

  public void setHobbies(Hobby[] hobbies) {
    this.hobbies = hobbies;
  }

  public Sport getSport() {
    return sport;
  }

  public void setSport(Sport sport) {
    this.sport = sport;
  }
}

package hobbies;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Sport box = new Sport("Box", false, "8");
    Sport karate = new Sport("Karate", true, "10");


    Hobby riding = new Hobby("Horse riding", true);
    Hobby painting = new Hobby("Painting", true);

    Hobby[] hobbies = {riding, painting};

    Human human = new Human("Taleh", "Aghayev", LocalDate.of(1990, 11, 23),hobbies, karate);

    System.out.println(human);

  }
}

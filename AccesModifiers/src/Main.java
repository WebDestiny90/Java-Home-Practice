public class Main {
  public static void main(String[] args) {
    Human human = new Human();
    Human taleh = new Human("Taleh","Aghayev",35,false);
    System.out.println(taleh.genderCheck(taleh.gender));
    System.out.println(taleh);

//    human.reception("Taleh");

    Animal cat = new Animal();
    cat.setName("luna");
    System.out.println(cat.getName());
//    cat.name = "Luna";
//    cat.age = 2;
//    Animal dog = new Animal();
//    dog.name = "Rex";
//    dog.age = 6;
//
//    System.out.println(cat.name);
  }
}
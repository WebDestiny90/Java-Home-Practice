public class Student extends Human{
  private String university;

  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  @Override
  public String toString() {
    return "Student{" + "name='" + name + '\'' + ", surName='" + surName + '\'' + ", university='" + university + '\'' + '}';
  }
}

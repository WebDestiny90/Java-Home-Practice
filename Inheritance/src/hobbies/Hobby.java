package hobbies;

public class Hobby {
  private String name;
  private boolean isFourSeason;

  public Hobby(String name, boolean isFourSeason) {
    this.name = name;
    this.isFourSeason = isFourSeason;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isFourSeason() {
    return isFourSeason;
  }

  public void setFourSeason(boolean fourSeason) {
    isFourSeason = fourSeason;
  }

  @Override
  public String toString() {
    return "Hobby{" + "name='" + name + '\'' + ", isFourSeason=" + isFourSeason + '}';
  }
}

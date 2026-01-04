package hobbies;

public class Sport {
  private String name;
  private boolean isOlympicGame;
  private String ageLimits;

  public Sport(String name, boolean isOlympicGame, String ageLimits) {
    this.name = name;
    this.isOlympicGame = isOlympicGame;
    this.ageLimits = ageLimits;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isOlympicGame() {
    return isOlympicGame;
  }

  public void setOlympicGame(boolean olympicGame) {
    isOlympicGame = olympicGame;
  }

  public String getAgeLimits() {
    return ageLimits;
  }

  public void setAgeLimits(String ageLimits) {
    this.ageLimits = ageLimits;
  }

  @Override
  public String toString() {
    return "Sport{" + "name='" + name + '\'' + ", isOlympicGame=" + isOlympicGame + ", ageLimits='" + ageLimits + '\'' + '}';
  }
}

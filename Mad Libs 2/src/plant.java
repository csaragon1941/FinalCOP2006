/* This class file is suppose to import some of the plant names into the main file.
 * It is mainly used to figure out sets and getters, as well as private fields.
 * 
 */
public class plant {
  private String typePlant;
  private int num;

  public plant(String typePlant) {
    this.typePlant = typePlant;

  }

  public plant() {
    typePlant = "Cactus";
    num = 2;

  }

  public String getTypePlant() {
    return typePlant;

  }

  public void setTypePlant(String typePlant) {
    this.typePlant = typePlant;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }
}

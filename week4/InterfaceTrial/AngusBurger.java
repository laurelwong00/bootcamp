package week4.InterfaceTrial;

public class AngusBurger implements Burger {
  
  private int patty;

  public int getPatty() {
    return this.patty;
  }

  public void setPatty(int patty) {
    this.patty = patty;
  }

  @Override
  public String slogan() {
    return "Our AngusBurger has " + this.patty + " patty, " + Burger.numOfLettuce + " Lettuce and " + Burger.numOfCheese + " cheese!";
  }
  public static void main(String[] args) {
    AngusBurger abg = new AngusBurger();
    abg.setPatty(2);
    System.out.println(abg.slogan());
  }
}


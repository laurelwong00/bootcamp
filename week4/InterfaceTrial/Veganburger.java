package week4.InterfaceTrial;

public class Veganburger implements Burger {
  
  private int extraLettuce;

  public int getExtraLettuce() {
    return this.extraLettuce;
  }

  public void setExtraLettuce(int extraLettuce) {
    this.extraLettuce = extraLettuce;
  }


  @Override
  public String slogan() {
    return "Our VeganBurger has " + this.extraLettuce + " Lettuce and " + Burger.numOfCheese + " cheese!";
  }

  public static void main(String[] args) {
    Veganburger vbg = new Veganburger();
    vbg.setExtraLettuce(4);
    System.out.println(vbg.slogan());
  }
}

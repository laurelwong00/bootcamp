package week4.Mcdonald;

public class PremiumBurger extends Allfood {
  private boolean isSpicy;

  public PremiumBurger(int price, String foodname, boolean isSpicy) {
    super(price, foodname);
    this.isSpicy = isSpicy;
  }

  public String spicyAlert() {
    if (isSpicy) {
      return super.toString() + " is spicy!!!";
    } else {
      return super.toString() + " is not spicy at all!!!";
    }
  }

  //@Override
  //public String toString() {
    //return super.toString() + this.isSpicy;
  //}
  public static void main(String[] args) {
    PremiumBurger premiumCheeseBurger = new PremiumBurger(27, "our worldclass burger for babies", false);
    System.out.println(premiumCheeseBurger.spicyAlert());
    System.out.println(Allfood.coupon);
    System.out.println(coupon);
    System.out.println(numOfLettuce);
  }

}
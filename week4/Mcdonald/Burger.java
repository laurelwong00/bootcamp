package week4.Mcdonald;

public class Burger {
  private int price;
  private String foodname;
  public static String coupon = "discount!";
  public static int numOfLettuce = 2;

  public Burger() {

  }

  public Burger(int price, String foodname) {
    this.price = price;
    this.foodname = foodname;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getFoodname() {
    return this.foodname;
  }

  public void setFoodName(String foodname) {
    this.foodname = foodname;
  }

  public String toString() {
    return this.price + this.foodname;
  }

  public static void main(String[] args) {
    Burger cheeseburger = new Burger();
    cheeseburger.setPrice(17);
    cheeseburger.setFoodName("no.1 cheeseburger");
    System.out.println(cheeseburger.getFoodname()); 

  }

}

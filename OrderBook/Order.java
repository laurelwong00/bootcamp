package OrderBook;

public class Order {
  
  private final long userId;
  private double price;
  private int quantity;
  private final boolean isBuyer;

  public Order(long userId, double price, int quantity, boolean isBuyer) {
    this.userId = userId;
    this.price = price;
    this.quantity = quantity;
    this.isBuyer = isBuyer;
  }

  public long getUserId() {
    return this.userId;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public boolean isBuyer() {
    return this.isBuyer;
  }

  public void reduceQuantity(int reducedQuantity) {
   this.quantity -= reducedQuantity;
  }

  @Override
  public String toString() {
    return "\nUserId: " + this.userId + " price: " + this.price + " quantity: " + this.quantity;
  }

}

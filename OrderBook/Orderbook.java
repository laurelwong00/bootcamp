package OrderBook;

import java.util.LinkedList;

public class Orderbook {

  private LinkedList<Order> buyOrders;
  private LinkedList<Order> sellOrders;
  private double lastTradedPrice;

  public Orderbook() {
    this.buyOrders = new LinkedList<>();
    this.sellOrders = new LinkedList<>();
    this.lastTradedPrice = 0;
  }

  public LinkedList<Order> getBuyOrders() {
    return this.buyOrders;
  }

  public LinkedList<Order> getSellOrders() {
    return this.sellOrders;
  }

  public double getLastTradedPrice() {
    return this.lastTradedPrice;
  }

  public void addOrder(Order order) {
    match(order);
    put(order);
  }

  private double getTopPrice(boolean isBuyList) {
    return (isBuyList)?buyOrders.peek().getPrice() : sellOrders.peek().getPrice();
  }

  private int getTopQuantity(boolean isBuyList) {
    return (isBuyList)?buyOrders.peek().getQuantity() : sellOrders.peek().getQuantity();
  }

  private double pollTopPrice(boolean isBuyList) {
    return (isBuyList)?buyOrders.poll().getPrice() : sellOrders.poll().getPrice();
  }

  private void match(Order order) {
    if (order.isBuyer() && !sellOrders.isEmpty()) {
      while (order.getPrice() >= getTopPrice(false)) {
        if (order.getQuantity() == getTopQuantity(false)) {
          order.setQuantity(0);
          lastTradedPrice = pollTopPrice(false);
          break;
        } else if (order.getQuantity() < getTopQuantity(false)) {
          sellOrders.peek().reduceQuantity(order.getQuantity());
          order.setQuantity(0);
          lastTradedPrice = getTopPrice(false);
          break;
        } else {
          order.reduceQuantity(getTopQuantity(false));
          lastTradedPrice = pollTopPrice(false);
        }

      }
    } else if (!order.isBuyer() && !buyOrders.isEmpty()) {
      while (order.getPrice() <= getTopPrice(true)) {
        if (order.getQuantity() == getTopQuantity(true)) {
          order.setQuantity(0);
          lastTradedPrice = pollTopPrice(true);
          break;
        } else if (order.getQuantity() < getTopQuantity(true)) {
          buyOrders.peek().reduceQuantity(order.getQuantity());
          order.setQuantity(0);
          lastTradedPrice = getTopPrice(true);
          break;
        } else {
          order.reduceQuantity(getTopQuantity(true));
          lastTradedPrice = pollTopPrice(true);
        }
      }
    }
  }

  private void put(Order order) {
    if (order.getQuantity() > 0) {
      if (order.isBuyer()) {
        if (!buyOrders.isEmpty()) {
          int idx = buyOrders.lastIndexOf(buyOrders.getLast());
          while (order.getPrice() > buyOrders.get(idx).getPrice()) {
            idx--;
            if (idx < 0) {
              break;
            }
          }
          buyOrders.add(idx + 1, order);
        } else {
          buyOrders.offer(order);
        }

      } else {
        if (!sellOrders.isEmpty()) {
          int idx = sellOrders.lastIndexOf(sellOrders.getLast());
          while (order.getPrice() < sellOrders.get(idx).getPrice()) {
            idx--;
            if (idx < 0) {
              break;
            }
          }
          sellOrders.add(idx + 1, order);
        } else {
          sellOrders.offer(order);
        }
      }
    }
  }
  
  @Override
  public String toString() {
    return "Updated orderbook \nBuyOrders: " + this.buyOrders + 
    "\nSellOrders: " + this.sellOrders + 
    "\nLastTradedPrice = " + this.lastTradedPrice;
    
  }
}

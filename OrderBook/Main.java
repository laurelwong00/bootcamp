package OrderBook;

public class Main {
  public static void main(String[] args) {
    Orderbook appleOrderBook = new Orderbook();
    appleOrderBook.addOrder(new Order(1001, 3, 2, true));
    appleOrderBook.addOrder(new Order(1002, 2, 4, true));
    appleOrderBook.addOrder(new Order(1003, 1, 3, true));
    appleOrderBook.addOrder(new Order(1004, 2, 6, true));
    appleOrderBook.addOrder(new Order(1006, 3, 7, true));
    appleOrderBook.addOrder(new Order(1007, 2, 2, false));
    appleOrderBook.addOrder(new Order(1001, 3, 2, false));
    appleOrderBook.addOrder(new Order(1002, 2, 4, false));
    appleOrderBook.addOrder(new Order(1003, 1, 3, true));
    appleOrderBook.addOrder(new Order(1004, 20, 6, false));
    appleOrderBook.addOrder(new Order(1006, 3, 7, true));
    appleOrderBook.addOrder(new Order(1007, 2, 2, false));
    System.out.println(appleOrderBook);
  }
}

package StreamDemo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
  private int orderId;
  private int customerId;
  private double amount;
  private LocalDate orderDate;

  public Order(int orderId, int customerId, double amount, LocalDate orderDate) {
    this.orderId = orderId;
    this.customerId = customerId;
    this.amount = amount;
    this.orderDate = orderDate;
  }

  public int getOrderId() {
    return this.orderId;
  }

  public int getCustomerId() {
    return this.customerId;
  }

  public double getAmount() {
    return this.amount;
  }

  public LocalDate getOrderDate() {
    return this.orderDate;
  }

  public static void main(String[] args) {
    List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 101, 800, LocalDate.of(2023, 4, 15)));
        orders.add(new Order(2, 102, 1200, LocalDate.of(2023, 4, 20)));
        orders.add(new Order(3, 101, 1500, LocalDate.of(2023, 4, 25)));
        orders.add(new Order(4, 103, 900, LocalDate.of(2023, 4, 18)));
        orders.add(new Order(5, 102, 1100, LocalDate.of(2023, 4, 22)));

    orders.stream().filter(e -> e.getAmount() < 1000)//
    .sorted((d1,d2) -> d2.getOrderDate().compareTo(d1.getOrderDate()))//isAfter()? -1:1
    .collect(Collectors.groupingBy(Order::getCustomerId,//
    Collectors.averagingDouble(Order::getAmount)));

    orders.stream().filter()
  }
}

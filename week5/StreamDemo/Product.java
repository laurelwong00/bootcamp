package StreamDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
  private String name;
  private String category;
  private double price;
  private int quantity;

  public Product(String name, String category, double price, int quantity) {
    this.name = name;
    this.category = category;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public String getCategory() {
    return this.category;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }


  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", 1200, 5));
        products.add(new Product("Book", "Stationery", 500, 10));
        products.add(new Product("Watch", "Fashion", 1500, 3));
        products.add(new Product("Headphones", "Electronics", 800, 8));
        products.add(new Product("Shoes", "Fashion", 2000, 2));

    List<String> result =products.stream().filter(product -> product.getPrice() > 1000).sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).map(product -> product.getName() + "-" + product.getQuantity()).collect(Collectors.toList());
  System.out.println(result);
  }
}

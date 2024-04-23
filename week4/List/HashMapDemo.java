package week4.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {

  public static void main(String[] args) {
    HashMap<String, Integer> mapper = new HashMap<>();//left hand side: key, right hand side value
    mapper.put("John", Integer.valueOf(13));
    mapper.put("Vincent", Integer.valueOf(18));
    //no ordering
    //get Value by key Key (we CANT get key by value)
    System.out.println(mapper.get("John")); //13
    System.out.println(mapper.get("Vincent")); //18

    //for each
    for (Map.Entry<String, Integer> m : mapper.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }
    //can change like that because only 1 vincent in map, can't duplicate becuz same hashcode
    mapper.put("Vincent", 20); //can't change vincent, only can change 20
    System.out.println(mapper.get("Vincent")); 
    mapper.put("Jenny", 24);

    int sum = 0;
    for (Map.Entry<String, Integer> m : mapper.entrySet()) {
      sum += m.getValue();
    }
    System.out.println(sum);

    HashMap<Customer, Integer> ageMap = new HashMap<>();
    ageMap.put(new Customer("John"), 13);
    ageMap.put(new Customer("John"), 17);
    System.out.println(ageMap.get(new Customer("John"))); //null when no hashmap override

    // Creating orderMap
    HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();
    Customer john = new Customer("John");
    Customer vincent = new Customer("Vincent");
    Customer sally = new Customer("Sally");

    // Adding orders for John
    ArrayList<Order> johnOrders = new ArrayList<>();
    johnOrders.add(new Order(100));
    johnOrders.add(new Order(250));
    orderMap.put(john, johnOrders);

    // Adding orders for Vincent
    ArrayList<Order> vincentOrders = new ArrayList<>();
    vincentOrders.add(new Order(1200));
    vincentOrders.add(new Order(20));
    vincentOrders.add(new Order(88));
    orderMap.put(vincent, vincentOrders);

    ArrayList<Order> sallyOrders = new ArrayList<>();
    sallyOrders.add(new Order(300));
    orderMap.put(sally, sallyOrders);

    // Retrieving and printing orders for John
    ArrayList<Order> johnOrdersList = orderMap.get(john);
    System.out.println("John's orders: " + johnOrdersList);

    // Retrieving and printing orders for Vincent
    ArrayList<Order> vincentOrdersList = orderMap.get(vincent);
    System.out.println("Vincent's orders: " + vincentOrdersList);

    ArrayList<Order> sallyOrdersList = orderMap.get(sally);
    System.out.println("Sally's orders: " + sallyOrdersList);

    // Calculating and printing total orders for each customer
    for (Map.Entry<Customer, ArrayList<Order>> entry : orderMap.entrySet()) {
        Customer customer = entry.getKey();
        ArrayList<Order> orders = entry.getValue();
        int totalOrders = 0;
        for (Order order : orders) {
            totalOrders += order.getAmount();
        }
        System.out.println(customer.getName() + "'s total orders: " + totalOrders);
    }
    HashMap<String, ArrayList<Order>> example1 = new HashMap<>();
    HashMap<String, ArrayList<Order>> example2 = new HashMap<>();

    
  }

}



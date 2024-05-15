public class PizzaOrderingSystem {
  public static void main(String[] args) {
      try {
          // Outer try block: Attempt to process pizza orders
          processPizzaOrders();
      } catch (PizzaOrderingException e) {
          // Outer catch block: Handle custom pizza ordering exceptions
          System.out.println("PizzaOrderingException caught: " + e.getMessage());
      } catch (Exception e) {
          // Outer catch block: Handle other types of exceptions
          System.out.println("Exception caught: " + e.getMessage());
      }
  }

  public static void processPizzaOrders() throws PizzaOrderingException {
      try {
          // Inner try block: Attempt to process individual pizza orders
          orderPizza("Margherita", 2); // This order will succeed
          orderPizza("Pepperoni", -1); // This order will throw an InvalidPizzaQuantityException
          orderPizza("Hawaiian", 3); // This order will throw an OutOfStockException
          orderPizza("Vegetarian", 1); // This order will succeed
      } catch (InvalidPizzaQuantityException e) {
          // Inner catch block: Handle invalid pizza quantity exception
          System.out.println("InvalidPizzaQuantityException caught: " + e.getMessage());
      } catch (OutOfStockException e) {
          // Inner catch block: Handle out-of-stock exception
          System.out.println("OutOfStockException caught: " + e.getMessage());
      }
  }

  public static void orderPizza(String pizzaType, int quantity) throws PizzaOrderingException {
      // Simulate pizza ordering process
      System.out.println("Ordering " + quantity + " " + pizzaType + " pizza(s)");

      // Check if quantity is valid
      if (quantity <= 0) {
          throw new InvalidPizzaQuantityException("Invalid quantity: " + quantity);
      }

      // Check if pizza is in stock
      if (!isPizzaAvailable(pizzaType)) {
          throw new OutOfStockException("Out of stock: " + pizzaType);
      }

      // Process the order (not implemented in this example)
      System.out.println("Processing order for " + quantity + " " + pizzaType + " pizza(s)");
  }

  public static boolean isPizzaAvailable(String pizzaType) {
      // In a real system, this method would check if the specified pizza is available in stock
      // For simplicity, we'll assume all pizzas are available
      return true;
  }
}

// Custom exception for pizza ordering errors
class PizzaOrderingException extends Exception {
  public PizzaOrderingException(String message) {
      super(message);
  }
}

// Custom exception for invalid pizza quantity
class InvalidPizzaQuantityException extends PizzaOrderingException {
  public InvalidPizzaQuantityException(String message) {
      super(message);
  }
}

// Custom exception for out-of-stock pizzas
class OutOfStockException extends PizzaOrderingException {
  public OutOfStockException(String message) {
      super(message);
  }
}

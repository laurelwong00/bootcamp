package week5.LambdaDemo;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierDemo {
  public static void main(String[] args) {
    Supplier<String> hello = () -> "hello";
    System.out.println(hello.get());

    UnaryOperator<String> uppercase = s -> s.toUpperCase().replace('E', 'R');
    System.out.println(uppercase.apply("hello"));

    
    
  }

}

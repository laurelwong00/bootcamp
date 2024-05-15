package StreamDemo;

import java.util.Optional;

public class DemoOptional {
  
  public static void main(String[] args) {
    System.out.println(upperName("Steven"));
    System.out.println(upperName("Steven").get());
    System.out.println(upperName(null));

    upperName(null).ifPresent(e -> {
      System.out.println("wtf is your name");
    });

  }

  public static Optional <String> upperName(String name) {
    if (name != null) {
      return Optional.of(name.toUpperCase());
    }
    return Optional.empty();
  }
}

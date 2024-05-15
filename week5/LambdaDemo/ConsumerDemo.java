package week5.LambdaDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    //void accept T t
    Consumer<String> printer = s -> System.out.println(s);
    printer.accept("hello");

    Consumer<List<Integer>> printer2 = list -> {
      for (Integer num : list) {
        System.out.print(num);
      }
    };
    printer2.accept(new ArrayList<>(List.of(13, 200, -3)));

    Consumer<List<Double>> printer3 = list -> {
      for (Double num : list) {
        System.out.println(num);
      }
    };
    printer3.accept(new LinkedList<>(List.of(1.3,2.0,3.38)));
  }
}

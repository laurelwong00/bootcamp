package StreamDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {
public static void main(String[] args) {
  Stream<String> empty = Stream.empty(); //static method -> constructor -> new Stream object
  System.out.println(empty.count()); //0

  Stream<String> strings = Stream.of("Hello", "Capy", "Bawa");

  Stream<Integer> integers = Stream.iterate(1, n -> n+2).limit(10);
  System.out.println(integers.collect(Collectors.toList()));

  strings.filter(e -> e.length() > 3).count(); //intermediate operation

  strings.forEach(e -> { //terminal operation
    System.out.println(e);
  });

  List<Integer> integers2 = new ArrayList<>(List.of(3, -1, 0, 100, -200));
  integers2.stream().filter(e -> e >= 0).sorted().collect(Collectors.toList());
  System.out.println(integers2);

  Comparator<Customer> ageComparator = (c1, c2) -> c1.getAge()> c2.getAge()? -1:1;

  List<Customer> customers = new LinkedList<>(List.of(new Customer(34, "Bawa"), new Customer(18, "Tommy"),new Customer(15, "Jenny")));
  customers.stream().sorted(ageComparator);

  List<String> names = customers.stream().filter(e -> e.getAge() > 13).map(e -> e.getName()).collect(Collectors.toList());
}  
}


package StreamDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFlatMap {
  public static void main(String[] args) {
    List<List<Integer>> integerLists = new ArrayList<>();
    integerLists.add(List.of(1,2,3,4));
    integerLists.add(List.of(10,-10,-100));
    integerLists.add(List.of(101,203,-4));

    List<Integer> flattenedList = integerLists.stream().flatMap(List::stream).collect(Collectors.toList());
    List<Integer> flattenedList1 = integerLists.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
    //same
    System.out.println(flattenedList);
    System.out.println(flattenedList1);
  }
}

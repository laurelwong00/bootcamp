package week4.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    integers.add(2);
  }

  public static Set<Integer> getDuplicated(List<Integer> integers) {
    Set<Integer> results = new HashSet<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer x : integers) {
      if (map.containsKey(x)) {
        results.add(x);
        continue;
      }
      map.put(x,null);
    }
    return results;
  }
}

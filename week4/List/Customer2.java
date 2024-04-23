package week4.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer2 {

  private String name;
  private ArrayList<Order> orders;
  
  public String getName() {
    return this.name;
  }
  public static void main(String[] args) {
    ArrayList<Customer2> customers = new ArrayList<>();

    for (Customer2 c: customers) {
      if (c.getName().equals("Vincent")) {

      }
    }

    HashSet<String> strings = new HashSet<>();
    strings.add("abc");
    strings.add("abc");
    System.out.println(strings.size()); //1 

    List<String> ss = new ArrayList<>();
    //ss object reference can only point to the methods that comply with List interface
    ss.add("hello");
    ss.remove(0);
    
    Set <String> ss2 = new ArrayList<>();
    ss2.add("hello");
    ss2.remove("hello");
    System.out.println(ss2.size());

    Map<String, String> StringMap = new HashMap<>();
    StringMap.put("John", "He");
    System.out.println(StringMap.get("John"));

    Collection<String> cs = new ArrayList<>();
    cs.add("hello");
    System.out.println(cs.size());

      if (cs instanceof ArrayList<String>) {
        ArrayList<String> as = (ArrayList<String>)cs;
        System.out.println(as.get(0));
      } else if (cs instanceof HashSet<String>) {
        HashSet<String> hs = (HashSet<String>) cs;
        System.out.println(hs.add("hello"));
      }
    }

  }


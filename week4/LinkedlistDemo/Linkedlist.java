package week4.LinkedlistDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("hello");
    strings.add("abc");
    System.out.println(strings.size()); //2

    strings.remove(1);
    System.out.println(strings);
    System.out.println(strings.contains("hello")); //alr implemented equals
    System.out.println(strings.contains(new String("hello")));

    List<String> ls = new LinkedList<>();
    ls.add("abc");
    ls.add("def");
    ls.add("bawa!");
    for (int i = 0; i < ls.size(); i++) {
      System.out.println(ls.get(i)); //for loop
      //if arraylist, 立刻到位 3, if linkedlist, 要走1,2先到 3
    }

    LinkedList<String> ll = new LinkedList<>();
    ll.add("hello"); //都系add last
    ll.addLast("abc");
    ll.addFirst("Jenny");
    System.out.println(ll);

    ArrayList<String> as = new ArrayList<>();
    as.add("hello"); //其實有for loop to copy array for us
    as.add("abc");
    as.remove(1); 
  }
}

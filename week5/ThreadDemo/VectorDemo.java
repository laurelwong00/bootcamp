package ThreadDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
  static List<Character> characters = new ArrayList<>();
  static List<Character> characters2 = new Vector<>();

  public static void main(String[] args) {
    Runnable concatLinkedList = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        characters2.add('s');
      }
    };
  
    Thread th1 = new Thread(concatLinkedList);
    Thread th2 = new Thread(concatLinkedList);
    th1.start();
    th2.start();
  
    try {
      th1.join();
      th2.join(); 
    } catch (InterruptedException e) {
  
    }
    System.out.println(characters2.size()); //maybe index out of bound
    //因爲arraylist copy 唔切 唔知道幾多個涌進來 唔夠位
  }
  
}

package week4.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

import week4.Comparator.SortByColor;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    Queue<Integer> integers = new PriorityQueue<>();
    integers.offer(12);
    integers.offer(5);
    integers.offer(-2);  
    System.out.println(integers);
    System.out.println(integers.poll()); //sorting
    System.out.println(integers.poll()); 
    System.out.println(integers.poll()); 

    integers.stream().forEach(x->System.out.println("x :" + x));

    

  }
}

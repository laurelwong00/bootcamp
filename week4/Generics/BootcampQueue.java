package week4.Generics;

import java.util.LinkedList;
import java.util.Queue;

public class BootcampQueue <T> {
  
  private Queue<T> data;
  private String s;
  private T offer2;

  public BootcampQueue() {
    this.data = new LinkedList<>();
  }

  public T poll() {
    return this.data.poll();
  }
  public void offer(T s) { //cant write object becuz it is a class, T is a class-to-be, can't new
    this.data.offer(s);
  }
  public void offer2(T data) {
    this.offer2 = data;
  }
  public static void main(String[] args) {
    BootcampQueue<String> bq = new BootcampQueue<>();
    bq.add("hello");

    bq.add(3);
  }
}

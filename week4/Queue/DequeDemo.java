package week4.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo { //Deque extends queue
  public static void main(String[] args) {
    Deque<String>strings= new LinkedList<>();
    strings.add("hello");//addLast -> tail
    strings.add("abc");

    strings.addFirst("ijk");//addFirst -> head
    System.out.println(strings);

    strings.pollFirst(); //default first 
    strings.pollLast(); //隊尾拿野and show what is 拿ed

    strings.peekLast();
    strings.peekFirst(); //just loop up

    


  }
}

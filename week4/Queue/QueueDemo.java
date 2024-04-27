package week4.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
  public static void main(String[] args) {
    //Queue係interface 合約
    List<String>strings = new LinkedList<>();
    strings.add("hello");
    strings.remove(0);
    strings.add("def");
    
    Queue<String> strings2 = (Queue<String>)strings; //萬一你第10行轉arraylist就出事啦
    //strings2.remove(); cannot
    //queue does not have index concept
    strings2.add("abc"); //size 2

    System.out.println(strings2.poll()); //隊頭拉走head object, return被拉走的head object
    //return 被刪除的head object arrest, 再轉埋new head object 拉住既野
    System.err.println(strings2);
    System.out.println(strings2.poll());//poll走abc
    System.out.println(strings2.poll());//沒野poll -> null
    //head object is first element in the queue
    strings2.add("xyz");
    strings2.add("ijk");
    System.out.println(strings2.peek());//just 眺望 head object (no removal)

    while (!strings2.isEmpty()) { //size() is not stable
      System.out.println(strings2.poll()); // size 0 after that
    }



    Queue<Integer> integers = new LinkedList<>();
    integers.add(1);
    integers.add(101);
    integers.add(2);
    integers.add(99);
    integers.add(-8);
    integers.add(14);

    int size = integers.size();
    int val = -1;
    while (size-- >0) {
      val = integers.poll();
      if (val % 2 == 1) {
        integers.add(val);
      }
    }
    System.out.println(integers);
    System.out.println(integers.remove()); //會error when empty
    System.out.println(integers.poll()); //最多Null
    integers.add(1000);
    System.out.println(integers.remove(1000)); //returns boolean //Integer.class override equals()
    

    int[]arr = new int[]{1,2,3};
    int[] backup = Arrays.copyOf(arr, arr.length);
    arr[1] = 100;
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(backup));

    Stack<String> strings4 = new Stack<>();
    strings4.push("hello");
    strings4.push("hello2");
    strings4.push("hello3");
    System.out.println(strings4);
    System.out.println(strings4.pop()); 

    //Queue or Deque -> LinkedList or Array
    Queue<String> qs = new ArrayDeque<>();
    qs.add("hello");
    qs.add("abc");
    qs.add("bawa");
    System.out.println(qs.poll());
    System.out.println(qs.remove("abc"));
    System.out.println(qs.size());
    System.out.println(qs);

    Deque<String> ds = (Deque<String>)qs;
    ds.addLast("mnm");
    ds.addFirst("nmn");
    System.out.println(ds);



    }

  }


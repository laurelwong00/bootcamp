package ThreadDemo;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.SynchronousQueue;

public class ConcurrentQueue {
  static Queue<Character> cq = new SynchronousQueue<>();
  static Queue<Character> cq2 = new ConcurrentLinkedQueue<>();

}

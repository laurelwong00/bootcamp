package ThreadDemo;

public class Task implements Runnable {
  @Override
  public void run() {
    System.out.println("I am a task I am running...");
  }
}

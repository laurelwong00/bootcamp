package ThreadDemo;

public class Calculator {
  public static int x = 17;

  public static synchronized void addOne() {
    x *= x;
  }
  public static void main(String[] args) {
    Runnable incrementOne = () -> {
      for (int i = 0; i < 5; i++) {
        addOne();
      }
    };

    Thread th1 = new Thread(incrementOne);
    Thread th2 = new Thread(incrementOne);
    th1.start();
    th2.start();

    try{
      th1.join();
      th2.join();
    }catch (InterruptedException e) {

    }

    System.out.println(Calculator.x); //17 18 19
  }
}

package ThreadDemo;

public class StringDemo {

  String s = "";
  public static void main(String[] args) {
    StringDemo obj = new StringDemo();
    Runnable concatString = () -> {
      for (int i = 0; i < 10000; i++) {
        obj.s = obj.s.concat("p");
      }
    };

    Thread th1 = new Thread(concatString);
    Thread th2 = new Thread(concatString);
    th1.start(); //calls runner method to run Runnable concatString
    th2.start();

    try{
      th1.join();
      th2.join(); //强制th1 th2 complete first before printing. 
      //th1 or th2 starts together, but who finish first? dont know. 
    } catch(InterruptedException e) {
      System.err.println("error");
    }
    System.out.println(obj.s.length());
  }
}

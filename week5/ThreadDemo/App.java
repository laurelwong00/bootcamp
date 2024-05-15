package ThreadDemo;

public class App {
  public static void main(String[] args) {
    //main thread and 2 threads th1 th2 

    //Lambda to create a runnable object (Thread constructor)
    //one off use in mains rare usage
    Task task = new Task();
    Runnable task2 = () -> {
      System.out.println("I am task2, I am running...");
    };

    //A class to implement Runnable interface(Thread constructor)
    //Share to colleagues they can just new a Thread and apply task
    Thread th1 = new Thread(task);
    Thread th2 = new Thread(task2);
    th1.start();
    th2.start();
    
    //MyThread extends Thread
    MyThread myThread = new MyThread();
    myThread.start();

    System.out.println("main ends..."); 
  }
}

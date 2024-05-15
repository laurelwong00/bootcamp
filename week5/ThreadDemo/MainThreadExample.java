package ThreadDemo;

public class MainThreadExample {
  public static void main(String[] args) {
      // Print a message to indicate the main thread has started
      System.out.println("Main thread started.");

      // Create a new thread
      Thread otherThread = new Thread(() -> {
          // Simulate some work being done by the other thread
          for (int i = 0; i < 5; i++) {
              System.out.println("Other thread working...");
              try {
                  Thread.sleep(1000); // Sleep for 1 second
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
          System.out.println("Other thread finished.");
      });

      // Start the other thread
      otherThread.start();

      // Continue executing tasks in the main thread
      for (int i = 0; i < 3; i++) {
          System.out.println("Main thread working...");
          try {
              Thread.sleep(1000); // Sleep for 1 second
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }

      // Print a message to indicate the main thread has finished
      System.out.println("Main thread finished.");
  }
}


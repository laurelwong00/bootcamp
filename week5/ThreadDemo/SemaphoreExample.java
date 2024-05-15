import java.util.concurrent.Semaphore;

public class SemaphoreExample {
// permit count 1, permit to access shared resource ie private String name
    private static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        // Create multiple threads to simulate concurrent access
        Thread thread1 = new Thread(new Worker("Worker 1"));
        Thread thread2 = new Thread(new Worker("Worker 2"));

        thread1.start(); //thread.start() calls run()
        thread2.start();
    }

    static class Worker implements Runnable {
        private String name;

        public Worker(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(name + " is waiting to acquire permit.");
                // Acquire a permit from the semaphore
                semaphore.acquire();
                System.out.println(name + " has acquired permit.");

                System.out.println(name + " is performing some work...");
                Thread.sleep(2000); 

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // Release the permit back to the semaphore
                semaphore.release();
                System.out.println(name + " has released permit.");
            }
        }
    }
}

// Worker 1 is waiting to acquire permit.
// Worker 2 is waiting to acquire permit.
// Worker 1 has acquired permit.
// Worker 1 is performing some work...
// Worker 2 has acquired permit.
// Worker 2 is performing some work...
// Worker 1 has released permit.
// Worker 2 has released permit.

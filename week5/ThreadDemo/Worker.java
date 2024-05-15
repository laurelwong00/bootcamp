import java.util.concurrent.Semaphore;

public class Worker implements Runnable {
    private final Semaphore semaphore;
    private final String name;

    public Worker(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting to acquire permit.");
            semaphore.acquire();
            System.out.println(name + " has acquired permit.");

            // Simulate some work
            System.out.println(name + " is performing some work...");
            Thread.sleep(2000); // Simulate work for 2 seconds

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println(name + " has released permit.");
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1); // Semaphore with initial permit count of 1

        Worker worker1 = new Worker(semaphore, "Worker 1");
        Worker worker2 = new Worker(semaphore, "Worker 2");

        Thread th1 = new Thread(worker1);
        Thread th2 = new Thread(worker2);

        th1.start();
        th2.start();
    }
}

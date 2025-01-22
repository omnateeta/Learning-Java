class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { // Each thread increments 5 times
            counter.increment();
            try {
                Thread.sleep(100); // Simulate some delay
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Counter sharedCounter = new Counter();

        // Creating multiple threads that share the same Counter object
        CounterThread thread1 = new CounterThread(sharedCounter);
        CounterThread thread2 = new CounterThread(sharedCounter);
        CounterThread thread3 = new CounterThread(sharedCounter);

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        thread3.setName("Thread-3");

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final count: " + sharedCounter.getCount());
    }
}

package lock;

public class Thread2 extends Thread {
    private Counter counter;

    public Thread2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true)
            counter.incrementImpair();
    }
}

package lock;

public class Thread1 extends Thread {
    private Counter counter;

    public Thread1(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true)
            counter.incrementPair();
    }
}

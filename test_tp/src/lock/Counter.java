package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 0;

    private final Lock lock = new ReentrantLock();


    public void incrementImpair() {
        while (count<100){
            try {
                lock.lock();
                if(count%2!=0){
                    System.out.println("Thread " + Thread.currentThread().getName() + " : " + count);
                    count++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public void incrementPair() {
        while (count<100){
            try {
                lock.lock();
                if (count % 2 == 0) {

                    System.out.println("Thread " + Thread.currentThread().getName() + " : " + count);
                    count++;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}

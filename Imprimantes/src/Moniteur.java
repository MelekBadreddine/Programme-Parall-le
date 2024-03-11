import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Moniteur {
    public boolean estLibre = true;
    final private ReentrantLock l = new ReentrantLock();
    private final Condition c = l.newCondition();
    public void debutImpression() {
        l.lock();
        try {
            while(!estLibre) {
                System.out.println(Thread.currentThread().getName() + " entered the stack");
                c.await();
                System.out.println(Thread.currentThread().getName() + " quit the stack");
            }
            estLibre = false;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            l.unlock();
        }
    }
    public void impression() {
        System.out.println(Thread.currentThread().getName() + " still using the printer");
    }
    public void finImpression() {
        l.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is no longer using the printer");
            estLibre = true;
            c.signal();
        } finally {
            l.unlock();
        }
    }
}

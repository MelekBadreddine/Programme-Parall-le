import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Moniteur {
	
	private int n = 100;
	private int nbCelluleDispo = n;
	private final ReentrantLock l = new ReentrantLock();
	private final Condition c = l.newCondition();
	
	void request(int amount) throws InterruptedException {
		l.lock();
		try {
			while(nbCelluleDispo < amount) {
				c.signal();
				System.out.println(Thread.currentThread().getName() + " requiring " + amount + " is waiting");
				c.await();
				System.out.println(Thread.currentThread().getName() + " requiring " + amount + " is leaving the stack");
			}
			nbCelluleDispo-= amount;
			System.out.println(Thread.currentThread().getName() + " reserved " + amount + " cells. Available memory: " + nbCelluleDispo);
		}
		finally {
			l.unlock();
		}
	}
	
	void release(int amount) {
		l.lock();
		try {
			nbCelluleDispo+= amount;
			System.out.println(Thread.currentThread().getName() + " released " + amount + " cells. Available memory: " + nbCelluleDispo);
			c.signal();
		}
		finally {
			l.unlock();
		}
	}
}

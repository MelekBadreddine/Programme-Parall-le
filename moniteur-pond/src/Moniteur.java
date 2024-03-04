import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Moniteur {
	
	private int nbV = 0;
	private int sensPond = 0;
	private final ReentrantLock l = new ReentrantLock();
	private final Condition c = l.newCondition();
	
	void rouler(int sensV) throws InterruptedException {
		l.lock();
		try {
			// 1e voiture
			if(nbV == 0) sensPond = sensV;
			// COND => attente
			while(sensV != sensPond) {
				c.await();
				if(nbV == 0) sensPond = sensV;
			}
			nbV++;
			System.out.println(Thread.currentThread().getName() + " passe sur le pond " + sensV);
		}
		finally {
			l.unlock();
		}
	}
	
	void accees_pond() {
		System.out.println(Thread.currentThread().getName() + " en cours sur le pond.");

	}
	
	void quitter(int sensV) throws InterruptedException {
		l.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " quitte le pond." + sensV);
			nbV--;
			c.signal();
		}
		finally {
			l.unlock();
		}
	}
	
}

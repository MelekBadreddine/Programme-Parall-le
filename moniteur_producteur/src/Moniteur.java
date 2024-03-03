import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Moniteur {
	
	private int i = 0;
	private int j = 0;
	private int n = 5;
	private int nbCaseVide = n;
	private int[] tab = new int[n];
	private final ReentrantLock l = new ReentrantLock();
	private final Condition c1 = l.newCondition();
	private final Condition c2 = l.newCondition();
	
	void ajouter() throws InterruptedException {
		l.lock();
		try {
			while(nbCaseVide == 0) {
				System.out.println("Prodcuteur en attente");
				c1.await();
				System.out.println("producteur quitte la file");
			}
			int x = (int) (Math.random() * 100);
			tab[i] = x;
			i = (i + 1) % n;
			nbCaseVide--;
			System.out.println("Le producteur produit: " + x);
			c2.signal();
			
		}
		finally {
			l.unlock();
		}
	}
	
	void prelever() throws InterruptedException {
		l.lock();
		try {
			while(nbCaseVide == n) {
				System.out.println("Consommateur en attente");
				c2.await();
				System.out.println("Consommateur quitte la file");
			}
			System.out.println("Le consommateur consomme: " + tab[j]);
			j = (j + 1) % n;
			nbCaseVide++;
			c1.signal();
		}
		finally {
			l.unlock();
		}
	}

}

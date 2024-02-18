
public class Producteur extends Thread {
	static int i = 0;
	public void run() {
		try {
			Test.nbCaseVide.acquire();
			Test.s.acquire();
			append();
			Test.s.release();
			Test.nbCasePleine.release();
		}
		catch(InterruptedException e) {}
	}
	public void append() {
		int x = (int) (Math.random() * 100);
		Test.tab[i] = x;
		i = (i + 1) % Test.n;
		System.out.println("Le producteur produit: " + x);
	}
}
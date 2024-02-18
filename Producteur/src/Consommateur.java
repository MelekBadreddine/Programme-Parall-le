
public class Consommateur extends Thread {
	
	static int j = 0;
	
	public void run() {
		try {
			Test.nbCasePleine.acquire();
			Test.s.acquire();
			take();
			Test.s.release();
			Test.nbCaseVide.release();
		}
		catch(InterruptedException e) {}
	}
	public void take() {
		System.out.println("Le consommateur consomme: " + Test.tab[j]);
		j = (j + 1) % Test.n;
	}
}
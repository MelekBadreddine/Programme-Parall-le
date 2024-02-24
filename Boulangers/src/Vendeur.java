
public class Vendeur extends Thread {
	
	int x;
	static int j = 0;
	
	Vendeur(int x) {
		this.x = x;
	}
	
	public void run() {
		try {
			Test.nbCasePleine.acquire(x);
			Test.s.acquire();
			retirer(x);
			Test.s.release();
			Test.nbCaseVide.release(x);
		}
		catch(InterruptedException e) {}
	}
	public Baguette[] retirer(int x) {
		Baguette[] sachet = new Baguette[x];
		for (int k=0; k<x; k++) {
			sachet[k] = Test.panier[(j+k)%Test.n];
		}
		j = (j + x) % Test.n;
		System.out.println("Le vendeur retire " + x + " baguettes");
		return sachet;
	}
}

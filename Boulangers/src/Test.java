import java.util.concurrent.Semaphore;

public class Test {
	
	static int n = 10;
	static Baguette[] panier = new Baguette[n];
	static Semaphore s = new Semaphore(1);
	static Semaphore nbCasePleine = new Semaphore(0);
	static Semaphore nbCaseVide = new Semaphore(n);

	public static void main(String[] args) {
		Boulanger b1 = new Boulanger();
		Boulanger b2 = new Boulanger();
		Boulanger b3 = new Boulanger();
		Vendeur v1 = new Vendeur(2);
		Vendeur v2 = new Vendeur(4);
		Vendeur v3 = new Vendeur(3);
		b1.start();
		b2.start();
		b3.start();
		v1.start();
		v2.start();
		v3.start();
	}

}

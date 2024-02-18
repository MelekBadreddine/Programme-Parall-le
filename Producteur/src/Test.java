import java.util.concurrent.Semaphore;

public class Test {
	
	static int n = 10;
	static int[] tab = new int[n];
	static Semaphore s = new Semaphore(1);
	static Semaphore nbCasePleine = new Semaphore(0);
	static Semaphore nbCaseVide = new Semaphore(n);

	public static void main(String[] args) {
		Producteur p1 = new Producteur();
		Producteur p2 = new Producteur();
		Producteur p3 = new Producteur();
		Consommateur c1 = new Consommateur();
		Consommateur c2 = new Consommateur();
		Consommateur c3 = new Consommateur();
		p1.start();
		p2.start();
		p3.start();
		c1.start();
		c2.start();
		c3.start();
	}
}
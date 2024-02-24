
public class Boulanger extends Thread {
	
	static int i = 0;
	
	public void run() {
		Baguette b = new Baguette();
		try {
			Test.nbCaseVide.acquire();
			Test.s.acquire();
			deposer(b);
			Test.s.release();
			Test.nbCasePleine.release();
		}
		catch(InterruptedException e) {}
		
	}
	public void deposer(Baguette b) {
		Test.panier[i] = b;
		i = (i + 1) % Test.n;
		System.out.println("Le boulanger depose une baguette");
	}
}
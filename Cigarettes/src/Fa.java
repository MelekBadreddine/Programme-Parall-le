public class Fa extends Thread {
	public void run() {
		while (true) {
		try {
			Test.pt.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fumer();
		Test.c.release();
	}}
	void fumer() {
		System.out.println("Je fume(a)");
	}
}
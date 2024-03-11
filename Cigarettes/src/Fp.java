
public class Fp extends Thread {
	public void run() {
		try {
			Test.at.acquire();
			System.out.println("Fp fume");
			Test.c.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}

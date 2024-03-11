
public class Ft extends Thread {
	public void run() {
		try {
			Test.ap.acquire();
			System.out.println("Ft fume");
			Test.c.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}

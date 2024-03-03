
public class Consommateur extends Thread {
	
	private Moniteur m;

	public Consommateur(Moniteur m) {
		this.m = m;
	}
	
	public void run() {
		try {
			m.prelever();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

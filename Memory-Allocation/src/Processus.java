
public class Processus extends Thread {
	
	private Moniteur m;
	private int x;
	
	public Processus(Moniteur m, int x) {
		this.m = m;
		this.x = x;
	}
	
	public void run() {
		int t = (int) Math.random() * 10000;
		try {
			m.request(x);
			sleep(t); 
			m.release(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

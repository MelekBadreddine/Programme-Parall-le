
public class Producteur extends Thread {
	
	private Moniteur m;

	public Producteur(Moniteur m) {
		this.m = m;
	}
	
	public void run() {
		try {
			m.ajouter();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class Auto extends Thread {
	
	int sens;
	Moniteur m;
	
	public Auto(Moniteur m, int sens) {
		this.m = m;
		this.sens = sens;
	}
	
	public void run() {
		try {
			m.rouler(sens);
			m.accees_pond();
			m.quitter(sens);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

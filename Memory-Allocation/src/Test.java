
public class Test {
	
	static Moniteur m = new Moniteur();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Processus p1 = new Processus(m, 25);
		Processus p2 = new Processus(m, 40);
		Processus p3 = new Processus(m, 10);
		Processus p4 = new Processus(m, 35);
		Processus p5 = new Processus(m, 50);
		Processus p6 = new Processus(m, 30);
		Processus p7 = new Processus(m, 55);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p7.start();
		
	}

}

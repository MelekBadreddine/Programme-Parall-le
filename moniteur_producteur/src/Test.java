
public class Test {
	
	static Moniteur m = new Moniteur();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producteur p1 = new Producteur(m);
		Producteur p2 = new Producteur(m);
		Producteur p3 = new Producteur(m);
		Producteur p4 = new Producteur(m);
		Producteur p5 = new Producteur(m);
		Producteur p6 = new Producteur(m);
		Producteur p7 = new Producteur(m);
		Consommateur c1 = new Consommateur(m);
		Consommateur c2 = new Consommateur(m);
		Consommateur c3 = new Consommateur(m);
		Consommateur c4 = new Consommateur(m);
		Consommateur c5 = new Consommateur(m);
		Consommateur c6 = new Consommateur(m);
		Consommateur c7 = new Consommateur(m);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p7.start();
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
		c7.start();
	}

}

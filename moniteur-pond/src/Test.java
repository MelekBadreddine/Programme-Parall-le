
public class Test {
	
	static Moniteur m = new Moniteur();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto p1 = new Auto(m, 1);
		Auto p2 = new Auto(m, 1);
		Auto p3 = new Auto(m, 1);
		Auto p4 = new Auto(m, -1);
		Auto p5 = new Auto(m, 1);
		Auto p6 = new Auto(m, -1);
		Auto p7 = new Auto(m, -1);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p7.start();

	}

}

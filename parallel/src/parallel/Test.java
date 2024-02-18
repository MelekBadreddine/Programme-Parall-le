package parallel;

public class Test {

	public static void main(String[] args) {
	Mythread t1 = new Mythread("Test 1");
	Mythread t2 = new Mythread("Test 2");
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	}
	catch(InterruptedException e) {}
	System.out.println("Fin");
	}

}

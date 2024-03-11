import java.util.concurrent.Semaphore;

public class Test {
	static Semaphore pt=new Semaphore(0);
	static Semaphore at=new Semaphore(0);
	static Semaphore ap=new Semaphore(0);
	static Semaphore c =new Semaphore(1);
	public static void main(String[] args) {

		Agent a=new Agent();
		Fa fa=new Fa();
		Fp fp=new Fp();
		Ft ft=new Ft();
		a.start();
		fp.start();
		ft.start();
		fa.start();
	}

}
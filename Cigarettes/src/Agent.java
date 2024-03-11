public class Agent extends Thread{
	String names[]= {"t","a","p"};
public void run() {
	while (true) {
	try {
		Test.c.acquire();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int x =(int)(Math.random()*3);
	int y =(int)(Math.random()*3);
	while(x==y) {
		 y =(int)(Math.random()*3);	
	}
	String a=names[x];
	String b=names[y];
	if ((a=="p" && b=="a")||(a=="a" && b=="p")) {
		System.out.println("je place p et a");
		Test.ap.release();
	}
	if ((a=="a" && b=="t")||(a=="t" && b=="a")) {
		System.out.println("je place t et a");
		Test.at.release();
	}
	if ((a=="p" && b=="t")||(a=="p" && b=="t")) {
		System.out.println("je place p et t");
		Test.pt.release();
	}
}}

}
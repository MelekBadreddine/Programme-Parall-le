import java.util.Scanner;

public class Principale {

	static int n=6;
	//declartation du tab
	static int[] tab = new int[n];
	void saisi() {
		Scanner Sc =new Scanner(System.in);
		for (int i=0;i<n;i++) {
			tab[i]=Sc.nextInt();
		}
		Sc.close();
	}
	void fusion() {
		int[] w = new int[n];
	    int i = 0, j = n / 2, k = 0;

	    // Merging the two sorted arrays
	    while (i < n / 2 && j < n) {
	        if (tab[i] <= tab[j]) {
	            w[k++] = tab[i++];
	        } else {
	            w[k++] = tab[j++];
	        }
	    }

	    // Copy the remaining elements of the first half (if any)
	    while (i < n / 2) {
	        w[k++] = tab[i++];
	    }

	    // Copy the remaining elements of the second half (if any)
	    while (j < n) {
	        w[k++] = tab[j++];
	    }

	    // Update the original array with the sorted elements
	    tab = w;
	}
	void affichage(){
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
		
	}
	public static void main(String[] args) {
		Principale p=new Principale();
		p.saisi();
		Trieur t1=new Trieur(0,n/2);
		Trieur t2=new Trieur(n/2,n);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			p.fusion();
			p.affichage();
		}catch(InterruptedException e) {
			
		}

	}

}

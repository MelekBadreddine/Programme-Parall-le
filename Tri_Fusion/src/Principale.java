import java.util.Scanner;

public class Principale {
	
	static int n = 6;
	//declaration du tableau
	int[] tab = new int[n];
	
	void saisir() {
		Scanner sc = new Scanner(System.in);
		for( int i=0; i<n; i++) {
			tab[i] = sc.nextInt();		
		}
	}
	
	void fusion() {
		int i = 0;
		int j = n/2;
		int k = 0;
		int[] w = new int[n];
		while(i<n/2 && j<n) {
			if(tab[i]<tab[j]) {
				w[k] = tab[i];
				i++;
				k++;
				if(i == n/2 - 1) {
					for(int p=j; p<n; p++) {
						w[k] = tab[p];
						k++;
					}
				}
				break;
			}
			else {
				w[k] = tab[j];
				j++;
				k++;
				if(j == n-1) {
					for(int p=i; p<n/2; p++) {
						w[k] = tab[p];
						k++;
					}
				}
				break;
			}
		}
		tab = w;
	}
	
	void affichage() {
		for(int i=0; i<n; i++) {
			System.out.println(tab[i]);
		}
	}

	public static void main(String[] args) {
		Principale P = new Principale();
		P.saisir();
		Trieur t1 = new Trieur(0, n/2);
		Trieur t2 = new Trieur(n/2, n);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			P.fusion();
			P.affichage();
		}
		catch(InterruptedException e) {
			
		}

	}

}

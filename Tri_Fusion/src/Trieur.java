public class Trieur extends Thread {
	int startIndex;
	int endIndex;
	Trieur(int startIndex,int endIndex){
		this.startIndex=startIndex;
		this.endIndex=endIndex;
		
	}
	public void run() {
        // Tri par insertion (Insertion Sort)
        for (int i = startIndex + 1; i < endIndex; i++) {
            int key = Principale.tab[i];
            int j = i - 1;

            while (j >= startIndex && Principale.tab[j] > key) {
                Principale.tab[j + 1] = Principale.tab[j];
                j = j - 1;
            }

            Principale.tab[j + 1] = key;
        }
    }
}

public class PAB extends Thread {
    String name;
    Moniteur a;
    Moniteur b;
    public PAB(String name, Moniteur a, Moniteur b) {
        super(name);
        this.a = a;
        this.b = b;
    }
    public void run() {
        if(a.estLibre == true) {
            a.debutImpression();
            a.impression();
            a.finImpression();
        }
        else {
            b.debutImpression();
            b.impression();
            b.finImpression();
        }
    }
}

public class Redacteur extends Thread {
    String name;
    Moniteur m;
    public Redacteur(String name, Moniteur m) {
        super(name);
        this.m = m;
    }
    public void run() {
        try {
            m.debutEcriture();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        m.ecrire();
        m.finEcriture();
    }
}

public class Lecteur extends Thread {
    String name;
    Moniteur m;
    public Lecteur(String name, Moniteur m) {
        super(name);
        this.m = m;
    }
    public void run() {
        try {
            m.debutLecture();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        m.lire();
        m.finLecture();
    }
}

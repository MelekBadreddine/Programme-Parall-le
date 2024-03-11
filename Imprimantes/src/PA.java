public class PA extends Thread {
    String name;
    Moniteur m;
    public PA(String name, Moniteur m) {
        super(name);
        this.m = m;
    }
    public void run() {
        m.debutImpression();
        m.impression();
        m.finImpression();
    }
}

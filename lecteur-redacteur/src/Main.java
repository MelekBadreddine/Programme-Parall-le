//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Moniteur m = new Moniteur();

    public static void main(String[] args) {
        Lecteur l1 = new Lecteur("Gafsi",  m);
        Lecteur l2 = new Lecteur("siMzid",  m);
        Lecteur l3 = new Lecteur("Doccor",  m);
        Lecteur l4 = new Lecteur("Boujii",  m);
        Lecteur l5 = new Lecteur("Chlouma",  m);
        Redacteur r1 = new Redacteur("Thouthou",  m);
        Redacteur r2 = new Redacteur("siAbdeltchif",  m);
        Redacteur r3 = new Redacteur("Hadhoud",  m);

        l1.start();
        l2.start();
        l3.start();
        l4.start();
        l5.start();

        r1.start();
        r2.start();
        r3.start();
    }
}
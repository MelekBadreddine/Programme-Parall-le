//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Moniteur A = new Moniteur();
        Moniteur B = new Moniteur();

        PA pa = new PA("Aone", A);
        PA pa1 = new PA("Atwo", A);
        PA pa2 = new PA("AThree", A);
        PB pb = new PB("Bone", B);

        PAB pab = new PAB("ABone", A, B);
        PAB pab1 = new PAB("ABtwo", A, B);

        pa.start();
        pa1.start();
        pa2.start();
        pb.start();
        pab.start();
        pab1.start();
    }
}
package priklad1;

public class App {
    public static void main(String[] args) {
        Lampicka l1 = new Lampicka();
        Lampicka l2 = new Lampicka();

        Lampicka.setMaxRozsvicenych(2);

        Lampicka.pocetRozsvicenych();

        l1.rozsvit();

        Lampicka.pocetRozsvicenych();
    }
}

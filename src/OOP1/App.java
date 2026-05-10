package OOP1;

public class App {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.nazev = "bourák";
        a1.barva = "černá";
        a1.pojizdne = true;
        a1.nastartovane = true;
        a1.setMaxSpeed(200);
        a1.setAktRychlost(110);

        Auto a2 = new Auto();
        a2.nazev = "hrom";


        Garaz a = new Garaz();
        a.setKapacita(5);
        a.zaparkuj(a1);
        a.zaparkuj(a2);
        a.info();
        a.vyparkuj(a1);
        a.info();

    }
}

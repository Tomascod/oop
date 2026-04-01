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


        Auto a2 = new Auto("plechovka","modrá");
        a2.setMaxSpeed(150);

        a1.vypisInfo();
        a1.stav();
        a1.zpomal(100);
        a1.vypnoutMotor();
        a1.stav();
        a1.zatrub();

    }
}
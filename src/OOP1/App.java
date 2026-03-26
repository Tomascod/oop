package OOP1;

public class App {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.nazev = "bourák";
        a1.barva = "černá";
        a1.pojizdne = true;
        a1.nastartovane = true;
        a1.maxSpeed = 201;
        a1.aktRychlost = 100;

        Auto a2 = new Auto();

        a2.nazev = "plechovka";
        a2.barva = "modrá";
        a2.pojizdne = false;
        a2.maxSpeed = 90;
        a2.aktRychlost = 50;

        a1.stav();
        a1.zpomal(60);
        a1.vypisInfo();
        a1.zpomal(40);
        a1.stav();
        a1.vypnoutMotor();
    }
}
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

        Auto a2 = new Auto("plechovka","modrá",225,128);


        a1.stav();
        a1.zpomal(60);
        a1.vypisInfo();
        a1.zpomal(40);
        a1.stav();
        a1.vypnoutMotor();
        a1.zatrub();

    }
}
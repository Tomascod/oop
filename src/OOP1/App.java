package OOP1;

public class App {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.nazev = "bourák";
        a1.barva = "černá";
        a1.pojizdne = true;
        a1.maxSpeed = 201;

        Auto a2 = new Auto();

        a2.nazev = "plech";
        a2.barva = "modrá";
        a2.pojizdne = false;
        a2.maxSpeed = 90;

        a2.vypisInfo();
        a2.stav();


    }
}
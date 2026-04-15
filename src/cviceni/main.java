package cviceni;

public class main {
    public static void main(String[] args) {
Clovek pepa = new Clovek();
pepa.jmeno = "Josef";
pepa.prijmeni = "Nový";
pepa.vypisJmeno();

Obdelnik jedna = new Obdelnik();
jedna.a = 5;
jedna.b = 6;
jedna.obsah();
jedna.obvod();

Lampicka lamp = new Lampicka();
lamp.vypisInfo();
lamp.rozsvit();
lamp.vypisInfo();
lamp.hasni();
lamp.vypisInfo();

Penezenka moje = new Penezenka();
moje.vypisZustatek();
moje.vlozCastku(600);
moje.vypisZustatek();
moje.vyberCastku(200);
moje.vypisZustatek();
    }
}

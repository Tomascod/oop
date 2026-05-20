package dedicnost;

public class Aoo {
    public static void main(String[] args) {
        Zvire z1 = new Zvire("Tonda");
        z1.vydejZvuk();

        PES p1 = new PES();
        p1.jmeno = "Fanda";
        p1.vydejZvuk();

        Papouch pap = new Papouch("Arný");
        pap.letani();
        System.out.println(pap.jmeno);

Dum hlahol = new Dum();
hlahol.pridejZvire(z1);
hlahol.pridejZvire(p1);
hlahol.vypisZvirata();
    }
}

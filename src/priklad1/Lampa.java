package priklad1;

public class Lampa {

    private boolean rozsvicena;

    private static int aktualneRozsviceno;
    private static int maxRozsviceno;

    public Lampa() {
        this.rozsvicena = false;
    }

    public static void setmaxRozsviceno(int max) {
        if (max >= 0) {
            maxRozsviceno = max;
        }
    }
    public void rozsvit() {
        if (this.rozsvicena) {
            System.out.println("Tahle lampička už je rozsvícená.");
        }
        if (aktualneRozsviceno >= maxRozsviceno) {
            System.out.println("Nelze rozsvítit: dosažen maximální počet rozsvícených lampiček = "+ maxRozsviceno);
        }

        this.rozsvicena = true;
        aktualneRozsviceno++;
    }

    public void zhasni() {
        if (!this.rozsvicena) {
            System.out.println("Tahle lampička už je zhasnutá.");
        }

        this.rozsvicena = false;
        aktualneRozsviceno--;
    }

    public void zjistiStav() {
        if (this.rozsvicena) {
            System.out.println("Lampička je rozsvícená.");
        } else {
            System.out.println("Lampička je zhasnutá.");
        }
    }

    static int getAktualneRozsviceno() {
        return aktualneRozsviceno;
    }

    static int getMaxRozsviceno() {
        return maxRozsviceno;
    }
}


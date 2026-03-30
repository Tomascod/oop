package OOP1;

public class Auto {
        String nazev;
        String barva;
        boolean pojizdne = true;
        boolean nastartovane;
        int maxSpeed;
        int aktRychlost;

        public Auto(){}

    public Auto(String nazev){
            this.nazev =nazev;
    }

    public Auto(String nazev, String barva){
            this(nazev);
            this.barva = barva;
    }

    public Auto(String nazev, int maxSpeed){
            this(nazev);
            this.maxSpeed = maxSpeed;
    }

    public Auto(String nazev, String barva,int maxSpeed,int aktRychlost){
            this(nazev, barva);
            this.maxSpeed = maxSpeed;
            this.aktRychlost = aktRychlost;
    }

        public void vypisInfo(){
            System.out.println("název: "+ this.nazev);
            System.out.println("barva: "+this.barva);
            System.out.println("Pojízdné: "+((this.pojizdne)?"ano":"ne"));
            System.out.println("maxSpeed: "+ this.maxSpeed);
            System.out.println("Aktuální rychlost: "+this.aktRychlost);
            System.out.println("______________________________");
        }

        public void stav(){
            if (pojizdne==false){
                System.out.println("Stojím a jen tak nepojedu, jsem rozbité");
            } else if (aktRychlost==0) {
                System.out.println("Stojím, ale jsem připravené k jízdě");
            }else System.out.println("jedu rychlostí " + aktRychlost + "km/h");
            System.out.println("______________________________");
        }

        public void nastartuj() {
            if (pojizdne){
                nastartovane = true;
            System.out.println("nastartoval jsem");
        }else {
                System.out.println("jsem rozbité, nemohu nastartovat");
            }
            System.out.println("______________________________");}

        public void zrychli(int oKolik){
            if (!nastartovane){
                System.out.println("nejdřív nastartuj");
            }else{
                aktRychlost+=oKolik;
                System.out.println("zrychlil jsem na "+aktRychlost+" km/h");}

            if (aktRychlost>maxSpeed){
                pojizdne = false;
                nastartovane = false;
                aktRychlost=0;
                System.out.println("přehřál si motor");
            }
            System.out.println("______________________________");
        }

        public void zpomal(int oKolik){

            if (aktRychlost<0){
                aktRychlost=0;
                System.out.println("Auto je zastaveno");
            }else { aktRychlost-=oKolik;
                System.out.println("zpomalil jsem na "+aktRychlost+" km/h");}
            System.out.println("______________________________");
        }

        public void vypnoutMotor(){
            if (aktRychlost>0){
                System.out.println("Nejdříve zastav auto");
            }else {
                nastartovane=false;
                System.out.println("Vypnul jsem motor");
            }
            System.out.println("______________________________");
        }

        public void zatrub(){
            System.out.println("trub - trub");
            System.out.println("______________________________");
        }
}

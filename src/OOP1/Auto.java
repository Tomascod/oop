package OOP1;

public class Auto {
        String nazev;
        String barva;
        boolean pojizdne;
        boolean nastartovane;
        int maxSpeed;
        int aktRychlost;

        public void vypisInfo(){
            System.out.println("název: "+ this.nazev);
            System.out.println("barva: "+this.barva);
            System.out.println("Pojízdné: "+((this.pojizdne)?"ano":"ne"));
            System.out.println("maxSpeed: "+ this.maxSpeed);
        }

        public void stav(){
            if (pojizdne==false){
                System.out.println("Stojím a jen tak nepojedu, jsem rozbité");
            } else if (aktRychlost==0) {
                System.out.println("Stojím, ale jsem připravené k jízdě");
            }else System.out.println("jedu rychlostí" + aktRychlost + "km/h");
        }

        public void nastartuj(){
            nastartovane = true;
        }

        public void zrychli(int oKolik){
            if (!nastartovane){
                System.out.println("nejdřív nastartujem");
            }else aktRychlost+=20;
        }
}

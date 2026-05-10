package OOP1;

import java.util.ArrayList;

public class Garaz {
    private int kapacita;
    String id;
    private ArrayList<Auto> seznam = new ArrayList<>();

    public Garaz(){}
    public void zaparkuj(Auto a){
        if (seznam.size()<kapacita){
            seznam.add(a);
            System.out.println("Zaparkováno");
        } else {
            System.out.println("Nezaparkováno");
        }
    }
    public void setKapacita(int kapacita) {
        this.kapacita = Math.max(1,kapacita);
    }
    public Garaz(int mista){
        this.setKapacita(mista);
    }
    public void vyparkuj(Auto a){
        seznam.remove(a);
    }
    public void info(){
        System.out.println("Kapacita:"+this.kapacita);
        System.out.println("Volná místa:"+(kapacita-seznam.size()));
        System.out.print("Zaparkovaná auta: ");
        for (Auto a:seznam){
            System.out.print(a.nazev+", ");
        }
        System.out.println();
    }
}
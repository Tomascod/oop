package dedicnost;

import java.util.ArrayList;
import java.util.Arrays;

public class Dum {
    ArrayList<Zvire> seznam = new ArrayList<>();

    public void pridejZvire(Zvire a){
        seznam.add(a);
    }

    public void vypisZvirata(){
        for (Zvire zvire:seznam){
            System.out.println(zvire.jmeno);
        }
    }
}

package cviceni;

public class Lampicka {
    Boolean stav = false;

    public void rozsvit(){
        stav = true;
    }
    public void hasni(){
        stav = false;
    }
    public void vypisInfo(){
        if (stav) System.out.println("rozsvíceno");
        else System.out.println("zhasnuto");
    }
}

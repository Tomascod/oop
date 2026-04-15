package cviceni;

public class Penezenka {
    private int zustatek;

    public void vlozCastku(int kolik) {
        System.out.println("Vloženo "+kolik+" Kč");
        zustatek += kolik;
    }

    public void vyberCastku(int kolik){
        if (kolik>zustatek){
            System.out.println("Nemůžeš vybrat tolik, máš jen "+zustatek);
        }else{
            System.out.println("Vybráno "+kolik+" Kč");
            zustatek -= kolik;
        }
    }

    public void vypisZustatek(){
        System.out.println("v peněžence máte "+ zustatek + " Kč");
    }
}

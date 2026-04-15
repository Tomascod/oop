package cviceni;

public class Obdelnik {
    int a;
    int b;

    public void obsah(){
        System.out.println("Obsah = "+ a*b );
    }

    public void obvod(){
        System.out.println("Obvod = "+2*(a+b));
    }

}

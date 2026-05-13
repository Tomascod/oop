package dedicnost;

public class PES extends Zvire{
    byte koncetiny;

    public PES(){}

    public PES(String jmeno){
        super(jmeno);
    }
@Override
    public void vydejZvuk(){
        System.out.println("Haf");
    }
}

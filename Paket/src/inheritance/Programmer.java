package inheritance;

public class Programmer extends Pegawai{
    private int bonus;
    
    public Programmer(String n, int g, int b){
        super(n,g);
        bonus=b;
    }
    
    public int infoGaji(){
        return super.gaji;
    }
    
    public int infoBonus(){
        return bonus;
    }    
        
}

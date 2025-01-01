package inheritance;

public class Manager extends Pegawai {
    private int tunjangan;
    
    public Manager(String n, int g, int t){
        super(n,g);
        this.tunjangan=t;
    }
    
    public int infoGaji(){
       return super.gaji;
    }
    
    public int infoTunjangan(){
        return tunjangan;
    }
}

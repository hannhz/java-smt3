package Kendaraan;

public class Sepeda extends Kendaraan{
    protected int jmlSadel;
    protected int jmlGir;
    
    public void setJmlSadel(int js){
        jmlSadel=js;
    }
    
    public int getJmlSadel(){
        System.out.println("Jumlah sadel : "+jmlSadel);
        return jmlSadel;
    }
    
    public void setJmlGir(int gir){
        jmlGir=gir;
    }
    
    public int getJmlGir(){
        System.out.println("Jumlah gir : "+jmlGir);
        return jmlGir;
    }
}

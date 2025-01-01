package Kendaraan;

public class Kendaraan {
    protected int jmlRoda;
    protected String warna;
    
    public void setJmlRoda(int r){
        jmlRoda=r;
    }
    
    public int getJmlRoda(){
        System.out.println("Jumlah roda : "+jmlRoda);
        return jmlRoda;
    }
    
    public void setWarna(String w){
        warna=w;
    }
    
    public String getWarna(){
        System.out.println("Jenis Warna"+warna);
        return warna;
    }
    
}

package perbankan;

public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String naw, String nak){
        namaAwal=naw;
        namaAkhir=nak;
    }
    
    public String getNamaAwal(){
        return namaAwal;
    }
    
    public String getNamaAkhir(){
        return namaAkhir;
    }
    
    public Tabungan getTabungan(){
        return tabungan;
    }
    
    public void setTabungan(Tabungan tab){
        this.tabungan=tab;
    }
    
}

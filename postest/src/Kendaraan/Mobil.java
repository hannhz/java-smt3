package Kendaraan;

public class Mobil extends Kendaraan{
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public void setBahanBakar(String bb){
        bahanBakar=bb;
    }
    
    public String getBahanBakar(){
        System.out.println("Jenis Bahan Bakar : ");
        return bahanBakar;
    }
    
    public void setKapasitasMesin(int km){
        kapasitasMesin=km;
    }
    
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
}

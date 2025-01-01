package Kendaraan;

public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKM;
    
    public void setTarifAwal(int ta){
        tarifAwal=ta;
    }
    
    public void setTarifPerKM(int km){
        tarifPerKM=km;
    }
    
    public int getTarifAwal(){
        return tarifAwal;
    }
    
    public int getTarifPerKM(){
        return tarifPerKM;
    }
    
}

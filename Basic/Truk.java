public class Truk {

    public double muatan;
    public double muatanmaks;
    
    public Truk (double beratmaks){
    muatanmaks = beratmaks;
    }
    
    public double getMuatanMaks() {
        return muatanmaks;
    }
    
    public double tambahMuatan(double berat){
        if (muatan + berat > muatanmaks) {
        return muatan;
    }
        
            muatan +=berat ;
            return muatan;
    }
    
    public double getMuatan(){
        return muatan;
    }
    
    
    
    
}

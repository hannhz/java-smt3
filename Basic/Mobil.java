public class Mobil{
    private String merk;
    private String warna;
    private String jenis;
    private int cc;
    private int jumlah;
    
    public void setMerk(String m){
        merk=m;
    }
    
    public void setWarna(String w){
        warna=w;
    }
    
    public void setJenis(String j) {
        jenis=j;
    }
    
    public void setCc(int c){
        cc=c;
    }
    
    public void setJumlah(int jml){
        jumlah=jml;
    }
    
    public void infoMobil(){
        System.out.println("Mobil merk "+merk+" berwarna "+warna+" memiliki jenis "+jenis+ " dengan Cc "+cc+ " berjumlah "+jumlah+ " penumpang.");        
    }
}
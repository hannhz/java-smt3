public class Cars{
    private String merk;
    private String warna;
    private String jenis;
    private int spek;
    private int jumlah;
    
    public void setMerk(String car){
        merk=car;
    }
    
    public void setWarna(String clr){
        warna=clr;
    }
    
    public void setJenis(String type) {
        jenis=type;
    }
    
    public void setCc(int cc){
        spek=cc;
    }
    
    public void setJumlah(int jmlh){
        jumlah=jmlh;
    }
    
    public void infoMobil(){
        System.out.println("DATA MOBIL");
        System.out.println("Merk: "+merk);
        System.out.println("Warna: "+warna);
        System.out.println("Jenis: "+jenis);
        System.out.println("Mesin: "+spek);
        System.out.println("Jumlah: "+jumlah);
        System.out.println("\n");
    }
}
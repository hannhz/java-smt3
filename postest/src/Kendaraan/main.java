
package Kendaraan;

public class main {

    public static void main(String[] args) {
        Truk truk1 = new Truk();
        Truk truk2 = new Truk();
        Taksi taksi1 = new Taksi();
        Taksi taksi2 = new Taksi();
        Sepeda sepeda1 = new Sepeda();
        Sepeda sepeda2 = new Sepeda();
        
        System.out.println("Truk 1");
        truk1.setJmlRoda(4);
        truk1.getJmlRoda();
        truk1.setWarna("kuning");
        truk1.setBahanBakar("solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);
        
        truk2.setJmlRoda(6);
        truk2.setWarna("merah");
        truk2.setBahanBakar("solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(5000);
        
        taksi1.setJmlRoda(4);
        taksi1.setWarna("oren");
        taksi1.setBahanBakar("bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKM(5000);
        
        taksi2.setJmlRoda(4);
        taksi2.setWarna("biru");
        taksi2.setBahanBakar("bensin");
        taksi2.setKapasitasMesin(1300);
        taksi2.setTarifAwal(7000);
        taksi2.setTarifPerKM(3500);
        
        sepeda1.setJmlRoda(3);
        sepeda1.setWarna("hitam");
        sepeda1.setJmlSadel(1);
        sepeda1.setJmlGir(2);
        
        sepeda2.setJmlRoda(2);
        sepeda2.setWarna("putih");
        sepeda2.setJmlSadel(2);
        sepeda2.setJmlGir(5);
        
        System.out.println();
        
    }
    
}

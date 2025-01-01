public class DataMobil{
    public static void main(String args[]){
        
        Cars mobil1 = new Cars();
        Cars mobil2 = new Cars();
        Cars mobil3 = new Cars();
        Cars mobil4 = new Cars();
        
        mobil1.setMerk("Toyota");
        mobil1.setWarna("Biru");
        mobil1.setJenis("Mini Bus");
        mobil1.setCc(2000);
        mobil1.setJumlah(7);
        mobil1.infoMobil();
        
        
        mobil2.setMerk("Daihatsu");
        mobil2.setWarna("Hitam");
        mobil2.setJenis("Pick Up");
        mobil2.setCc(1500);
        mobil2.setJumlah(2);
        mobil2.infoMobil();
        
        mobil3.setMerk("Suzuki");
        mobil3.setWarna("Silver");
        mobil3.setJenis("Suv");
        mobil3.setCc(1800);
        mobil3.setJumlah(5);
        mobil3.infoMobil();
        
        
        mobil4.setMerk("Honda");
        mobil4.setWarna("Merah");
        mobil4.setJenis("Sedan");
        mobil4.setCc(1300);
        mobil4.setJumlah(5);
        mobil4.infoMobil();
        
    }
}
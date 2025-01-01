package perbankan;

public class Bank {
    private Nasabah nasabah[];
    private int jumlahNasabah;
    
    public Bank(){
        nasabah =new Nasabah[100];
        jumlahNasabah=0;
    }
    
    public void tambahNasabah(String naw, String nak){
        Nasabah n = new Nasabah(naw, nak);
        nasabah[jumlahNasabah] = n;
        jumlahNasabah++;
    }
    
    public int getJumlahNasabah(){
        return jumlahNasabah;
    }
    public Nasabah getNasabah(int i){
        if (i>=0&& i< jumlahNasabah){
            return nasabah[i];
        } else {
            return null;
        }
    }
}

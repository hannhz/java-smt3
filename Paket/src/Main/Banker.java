package Main;
import perbankan.*;

public class Banker {
    public static void main(String args[]){
        Bank bank = new Bank();
        
        bank.tambahNasabah("Abdi","Darmawan");
        bank.getNasabah(0).setTabungan(new Tabungan(5000));
        
        bank.tambahNasabah("Putera", "Wiranata");
        bank.getNasabah(1).setTabungan(new Tabungan(7000));
        
        bank.tambahNasabah("Gadis","Abysis");
        bank.getNasabah(2).setTabungan(new Tabungan(4000));
        
        bank.tambahNasabah("Kembang", "Seruni");
        bank.getNasabah(3).setTabungan(new Tabungan(6500));
        
        System.out.println("Jumlash Nasabah = "+bank.getJumlahNasabah());
        
        for(int i=0; i<bank.getJumlahNasabah();i++){
            System.out.println("Nasabah ke-"+(i+1)+" : "
                    +bank.getNasabah(i).getNamaAwal()+" "
                    +bank.getNasabah(i).getNamaAkhir()+" ;  Saldo = "
                    +bank.getNasabah(i).getTabungan().getSaldo());
        }
    }
}

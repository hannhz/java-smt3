package Main;
import perbankan.*;

public class BankAnak {
    public static void main(String[] args) {
        PengambilanUang tabungan = new PengambilanUang(5000,1000);
        System.out.println("Uang yang ditabung    : 5000");
        System.out.println("Uang yang diproteksi  : 1000");
        System.out.println("============================");
        System.out.println("Uang yang mau diambil : 4500"+tabungan.ambilUang(4500));
        System.out.println("Saldo sekarang        : "+tabungan.getSaldo());
        System.out.println("============================");
        System.out.println("Uang yang mau diambil : 2500"+tabungan.ambilUang(2500));
        System.out.println("Saldo sekarang        : "+tabungan.getSaldo());
    }
    
}


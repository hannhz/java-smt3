package Main;

import perbankan.*;
import java.util.Scanner;

public class Bankk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan nama awal: ");
        String naw = scanner.nextLine();
        
        System.out.println("Masukkan nama akhir: ");
        String nak = scanner.nextLine();
        
        Nasabah nasabah = new Nasabah(naw, nak);
        
        System.out.println("Masukkan saldo awal: ");
        int saldo = scanner.nextInt();
        
        Tabungan tabungan = new Tabungan(saldo);
        nasabah.setTabungan(tabungan);
        
        System.out.println("Saldo awal: "+nasabah.getTabungan().getSaldo());
        System.out.println();
                
        System.out.println("Jumlah yang ingin di tabung: ");
        int tabung = scanner.nextInt();
        nasabah.getTabungan().simpanUang(tabung);
        System.out.println("Saldo yang masuk "+tabung+". total: "+nasabah.getTabungan().getSaldo());
        
        System.out.println("Jumlah yang ingin di ambil: ");
        int ambil = scanner.nextInt();
        if (nasabah.getTabungan().ambilUang(ambil)){
            System.out.println("Saldo yang keluar"+ambil+". total: "+nasabah.getTabungan().getSaldo());
        } else {
            System.out.println("Saldo tidak cukup");
        }        
    }
}


package aaaaaaaa;

public class GetAargument {
    public static void main(String args[]) {
        
        if (args.length < 3) {
            System.out.println("Error: Mohon masukkan tiga argumen (tanggal, bulan, tahun).");
            return;
        }
        
        System.out.println("Tanggal : " + args[0]);
        System.out.println("Bulan : " + args[1]);
        System.out.println("Tahun : " + args[2]);
    }
}
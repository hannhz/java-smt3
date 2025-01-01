public class Tabungan {

    private int saldo; // Ubah saldo menjadi private untuk enkapsulasi data
    
    public Tabungan(int intisaldo) {
        saldo = intisaldo;
    }

    public void simpanUang(int tambah) {
        saldo += tambah;
    }

    // Metode diperbarui untuk mengembalikan boolean dan memeriksa saldo
    public boolean ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            return true; // Penarikan berhasil
        } else {
            return false; // Saldo tidak mencukupi
        }
    }

    public int getSaldo() {
        return saldo;
    }
}


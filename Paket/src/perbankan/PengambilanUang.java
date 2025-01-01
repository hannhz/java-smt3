
package perbankan;

public class PengambilanUang extends Tabungan {
    private int proteksi;
    
    public PengambilanUang(int saldo){
        super(saldo);
    }
    
    public PengambilanUang(int saldo, int bunga){
        super(saldo);
        bunga=proteksi;
    }
    
    public int getSaldo(){
        return super.getSaldo();
    }
    
    public boolean ambilUang(int u){
        if (getSaldo()-u>=proteksi){
            return super.ambilUang(u);
        } else {
            return false;
        }
    }
        
}

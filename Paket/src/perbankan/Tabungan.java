package perbankan;

public class Tabungan {
    private int saldo;
    
    public Tabungan(int i){
        this.saldo=i;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public int simpanUang(int k){
        saldo=saldo+k;
        return saldo;
    }
    
    public boolean ambilUang(int u){
        if (saldo>=u){
            saldo = saldo-u;
            return true;
        } else {
            return false;
        }
    }
    
}


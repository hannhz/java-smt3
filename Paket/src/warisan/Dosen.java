package warisan;

public class Dosen extends Pegawai{
    private String prodi;

    public Dosen(String n, String p){
        super.getNama(n);
        this.prodi=p;
    }
    
    public void showDosen(){
        System.out.println("Nama Dosen : "+super.showNama());
        System.out.println("Prodinya   : "+this.prodi);
    }

}

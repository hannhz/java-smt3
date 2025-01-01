public class Buku{
    private String nama;
    private int nomer;
    private int tahun;
    
    public void setNama(String n){
        nama=n;
    }
    
    public void setNo (int no){
        nomer=no;
    }
    
    public void setTahun(int t){
        tahun=t;
    }
    
    public void  infoBuku(){
        System.out.println("Buku " +nama+ " nomor " +nomer+ " tahun cetak " +tahun);
    }
}
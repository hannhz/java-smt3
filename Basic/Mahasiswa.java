public class Mahasiswa {
    public int nrp;
    public String nama;
    private String prodi;
    private int tahun;
    
    public Mahasiswa (int i, String n){
        nrp = i;
        nama = n;
    }
    
    public void setProdi(String p){
        prodi=p;
    }
    
    public void setTahun (int t){
        tahun=t;
    }
    
    public void dataMahasiswa(){
        System.out.println(nama+ ", nrp " +nrp+ ", " +prodi+ ", " +tahun+ ". ");
    }
}

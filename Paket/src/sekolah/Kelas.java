package sekolah;

public class Kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;
    
    public Kelas(int kode, String nama){
        this.kodekelas=kode;
        this.namakelas=nama;
    }
    
    public void setMhs(Mahasiswa mhs){
        this.mahasiswa=mhs;
    }
    
    public void cetakKelas(){
        System.out.println("Kode kelas : "+kodekelas);
        System.out.println("Nama kelas : "+namakelas);
        System.out.println("Mahasiswa : " +mahasiswa.getNama()
                +"("+mahasiswa.getNrp()+")");
    }
}

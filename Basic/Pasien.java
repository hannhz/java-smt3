public class Pasien{
    private String name;
    private String gender;
    private String alamat;
    private String riwayatSakit;
    private int umur;
    private int ktp; 
    
    public Pasien(String n, String g, String a, String r, int u, int k){
        name=n; gender=g; alamat=a; riwayatSakit=r; umur=u; ktp=k; 
    }
    
    public void infoPasien(){
        System.out.println("===== DATA PASIEN =====");
        System.out.println("Nama ; "+name);
        System.out.println("Alamat : " +alamat);
        System.out.println("Gender : " +gender);
        System.out.println("Umur : " +umur);
        System.out.println("No KTP : " +ktp);
        System.out.println("Riwayat Penyakit : " +riwayatSakit);
        System.out.println("=======================");
        System.out.println("\n");
    }
    
    public void namaPasien(){
        System.out.println(""+name);   
    }
    
    public void recapPenyakit(){
        System.out.println("Nama : "+name);
        System.out.println("Riwayat Penyakit : "+riwayatSakit);
    }
    
}
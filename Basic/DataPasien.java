public class DataPasien{
    public static void main (String args[]){
        
        Pasien pas1=new Pasien("Dodit", "Laki-laki", "Sleman", "-", 45, 5627318);
        Pasien pas2=new Pasien("Dodot", "Laki-laki", "Bantul", "Asma", 41, 3882042);
        Pasien pas3=new Pasien("Didit", "Perempuan", "Yogya", "jantung", 07, 8876374);
        
        pas1.infoPasien();
        pas2.infoPasien();
        pas3.infoPasien();
        
        System.out.println("=== Nama Pasien ===");
        pas1.namaPasien();  qqqaq
        pas2.namaPasien();
        pas3.namaPasien();
        
        System.out.println("== Data riwayat penyakit ===");
        pas1.recapPenyakit();
        pas2.recapPenyakit();
        pas3.recapPenyakit();
        
    }
}

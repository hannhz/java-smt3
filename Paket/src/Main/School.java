package Main;

import sekolah.*;

public class School {

    public static void main(String[] args) {
        Kelas kelas=new Kelas(9009,"IPA XI");
        Mahasiswa anak=new Mahasiswa(1995,"May");
        //System.out.println("Mahasiswa : "+anak);
        kelas.setMhs(anak);
        kelas.cetakKelas();
    }
    
}


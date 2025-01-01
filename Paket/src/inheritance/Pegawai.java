package inheritance;

public class Pegawai {
    protected String nama;
    protected int gaji;
    
   public Pegawai(String n, int g){
       nama =n;
       gaji =g;
   }
   
   public int infoGaji(){
       return gaji;
   }
    
}

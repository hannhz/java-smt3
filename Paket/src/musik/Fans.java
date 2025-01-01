package musik;

public class Fans {
    private String nama;
    
    public Fans(){
    }
    
    public Fans(String n){
        this.nama=n;
    }
    
    public void showNama(){
        System.out.print(nama);
    }
    
    public void watchingPerfomances(){
        System.out.print("Melihat Idolanya dari youtube");
    }
    
    public void watchingPerfomances(Musician m){
        System.out.println();
        System.out.print(nama + " : ");
        System.out.print("Melihat idolanya ");
        m.perform();
    }
        
}

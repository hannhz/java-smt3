package musik;

public class KpopFans extends Fans{
    public KpopFans(){}
    
    public KpopFans(String nama){
        super(nama);
    }
    
    public void watchingPerfomances(Musician m, String expression){
        System.out.println();
        super.showNama();
        System.out.print(" : ");
        System.out.print(expression);
        System.out.print("Melihat idolanya ");
        m.perform();
    }
}

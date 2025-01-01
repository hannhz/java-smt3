package musik;
public class Test {
    public static void main(String[] args) {
        Fans fans1 = new Fans();
        Fans fans2 = new Fans("Mona");
        Fans fans3 = new KpopFans("Tomi");
        KpopFans fans4 = new KpopFans("Febi");
        
        fans1.watchingPerfomances();
        fans2.watchingPerfomances(new Musician());
        fans2.watchingPerfomances(new Singer());
        fans3.watchingPerfomances(new Biduan());
        fans4.watchingPerfomances(new Kpop(), "Teriak histeris ");
        
    }
    
}

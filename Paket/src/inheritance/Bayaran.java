package inheritance;

public class Bayaran {
    public int hitungbayaran(Pegawai peg){
        int uang = peg.infoGaji();
        if(peg instanceof Manager)
            uang += ((Manager) peg).infoTunjangan();
        else if (peg instanceof Programmer)
            uang += ((Programmer) peg).infoBonus();
        return uang;
    }
    
    public static void main(String args[]){
        Manager man = new Manager("Setyo", 800, 50);
        Programmer prog = new Programmer("Chan", 600, 30);
        Bayaran hr = new Bayaran();
        
        System.out.println("Bayaran untuk Manager : "+hr.hitungbayaran(man));
        System.out.println("Bayaran untuk Programmmer : "+hr.hitungbayaran(prog));
    }
}


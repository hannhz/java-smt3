package testioe;

import java.util.Scanner;

public class FaktorialLat {
    public static void main (String args[]){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Angka ke-n : ");
        int angkaKeN = scanner.nextInt();
                
        System.out.println("n\tn!");
        System.out.println("------------");
        
        Ffaktorial itung =new Ffaktorial();        
        itung.faktorial(angkaKeN);
        
        System.out.println("------------");      
    }
}



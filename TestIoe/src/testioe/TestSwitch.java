package testioe;

import java.io.IOException;

public class TestSwitch {
    public static void main(String args[]){
        char firstInitial = 'a';
        System.out.println("Inisialmu:");
        try {
            firstInitial = (char)System.in.read();
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        }
        
        switch (firstInitial) {
        case 'a':
            System.out.println("Namamu pasti Akbar!");
        case 'b':
            System.out.println("Namamu pasti Badang!");
        case 'c':
            System.out.println("Namamu pasti Choirul!");
        default:
            System.out.println("Kamu siapa??");
        }  
    }
    
}

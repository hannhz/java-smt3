import java.io.IOException;

public class SwitchName{
    public static void main(String args[]){
        char firstInitial = 'a';
        System.out.println("Masukkan inisialmu: ");
        try {
            firstInitial = (char)System.in.read();
        } catch (IOException e) {
            System.out.println("Naon maneh eror ini: "+ e.toString());
        }
        switch (firstInitial) {
            case 'a':
                System.out.println("Your name is Abdul");
            case 'b':
                System.out.println("your name is Budi");
            case 'c':
                System.out.println("your name is Candra");
            default:
                System.out.println("saha maneh wehhh???");
                
        }
    }
}
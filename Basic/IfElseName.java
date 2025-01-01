import java.io.IOException;

class IfElseName{
    public static void main (String args[]){
        char firstInitial = 'A';
        System.out.println("Masukkan inisial namamu: ");
       try {
            firstInitial = (char)System.in.read();
        } catch (IOException e) {
            System.out.println("Eror: " + e.toString());
        }
        
        if (firstInitial == 'A')
            System.out.println("Namamu pasti Abrisam!");
        else if (firstInitial == 'B')
            System.out.println("Namamu pasti Balaram!");
        else if (firstInitial == 'C')
            System.out.println("Namamu pasti Ceria!");
        else 
            System.out.println("Saha maneh euy??");
    }
}
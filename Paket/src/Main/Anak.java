package Main;

import inheritance.*;

public class Anak {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.isiData("Putera","DesGraf");
        System.out.println(manager.getNama()+" "+manager.departemen);
    }
    
}

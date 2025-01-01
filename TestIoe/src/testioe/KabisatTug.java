package testioe;

import java.util.Scanner;

public class KabisatTug {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Tebak kabisat (only 1900-2005):");
        int tahun = scanner.nextInt();
        if(tahun>=1900 & tahun<=2005){
            if(tahun%4==0){
                System.out.println(tahun + " itu tahun kabisat!");
            } else {
                System.out.println("yah, bukan tahun kabisat..");
            }
        } else {
            System.out.println("Tida bole melebihi batas (-3-)");
        }
    }
    
}

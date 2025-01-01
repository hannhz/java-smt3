package testioe;

public class Ffaktorial {
    //public static void main (String args[]){
    int hasil = 1;
     public int faktorial(int angka){
         for (int i =1;i<=angka;i++){
             //System.out.println("ini faktor : "+i);
             for(int f =1;f<=i;f++){
                 hasil *= f;
                 //System.out.println("ini isi : "+f);
             }
             //System.out.println("Faktorialnya :"+hasil); 
             System.out.printf("%d\t%d\n",i,hasil);
             hasil = 1;
             }
         return 0;
     }
}


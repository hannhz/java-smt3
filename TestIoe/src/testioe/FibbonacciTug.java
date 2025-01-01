package testioe;

import java.util.Scanner;

public class FibbonacciTug {
    public static void main (String args[]){
        int input, a=1, b=1;
        Scanner scanner =new Scanner(System.in);
        
        System.out.print("Banyaknya deret : ");
        input = scanner.nextInt();
        
        System.out.println(input + " deret fibonacci :");
        for(int i =0; i<input;i++){
            System.out.println(a + " ");
            int h = b+a;
            a = b;
            b = h;
        }
    }
}

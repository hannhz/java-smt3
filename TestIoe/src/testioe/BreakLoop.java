
package testioe;

public class BreakLoop {
    public static void main (String args[]){
        int i = 0;
        do {
            System.out.print("Iterasi ke : "+i+"\n");
            i++;
            if (i > 10) break;
        }
        while (true);
    }
}

import javax.swing.JOptionPane;

public class BilanganTerkecil {
    
    public void inputBilangan() {
        String input1 = JOptionPane.showInputDialog("Masukkan bilangan pertama:");
        String input2 = JOptionPane.showInputDialog("Masukkan bilangan kedua:");
        String input3 = JOptionPane.showInputDialog("Masukkan bilangan ketiga:");

        int bil1 = Integer.parseInt(input1);
        int bil2 = Integer.parseInt(input2);
        int bil3 = Integer.parseInt(input3);

        int terkecil = cariTerkecil(bil1, bil2, bil3);
        
        JOptionPane.showMessageDialog(null, "Bilangan terkecil adalah: " + terkecil);
        
        System.out.println("Bilangan terkecil dari " + bil1 + bil2 + bil3 + " adalah " + terkecil);
    }

    private int cariTerkecil(int bil1, int bil2, int bil3) {
        return Math.min(bil1, Math.min(bil2, bil3));
    }
}

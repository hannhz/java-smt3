import javax.swing.JOptionPane;

public class TugasBola {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Masukkan jari-jari bola:");

        double jariJari = Double.parseDouble(input);

        Volum volume = new Volum();
        volume.VolumBola(jariJari);
    }
}

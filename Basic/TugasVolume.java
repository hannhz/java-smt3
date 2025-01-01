import javax.swing.JOptionPane;

public class TugasVolume {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Masukkan jari-jari bola:");

        double jariJari = Double.parseDouble(input);

        Volume volume = new Volume();
        volume.hitungVolumeBola(jariJari);
    }
}

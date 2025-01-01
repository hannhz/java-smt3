public class Volume {

    public void hitungVolumeBola(double jariJari) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        String duaAngka = String.format("%.2f", volume);
        System.out.println("Volume bola dengan jari-jari " + jariJari + " adalah: " + duaAngka);
    }
}

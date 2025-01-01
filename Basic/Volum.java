public class Volum {

    public void VolumBola(double jariJari) {
        double volum = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        String desimal = String.format("%.2f", volum);
        System.out.println("Volume bola berjari-jari " + jariJari + " : " + desimal);
    }
}

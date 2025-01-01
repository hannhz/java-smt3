import javax.swing.JOptionPane;
public class Konversi{
	public static void main(String args[]){
		int suhu;
		String str = JOptionPane.showInputDialog("Masukkan suhu celcius :");
		suhu = Integer.parseInt(str);
		int konversi = suhu * 9/5 + 32;
		System.out.println("Suhu dalam Fahrenheit :" + konversi);
	}
}


import javax.swing.JOptionPane;
public class InputPane {
	public static void main(String args[]){
		int nilai;
		String str = JOptionPane.showInputDialog("masukkan nilai :");
		nilai = Integer.parseInt(str);
		System.out.println(nilai);
	}
}
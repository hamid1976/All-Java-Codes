import javax.swing.*;
class Ouncetostone{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Ounce");
	int Stone=Integer.parseInt(a);
	int ounce=Stone/ 224;
	JOptionPane.showMessageDialog(null,"stone="+ounce);
	}
}
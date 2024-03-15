import javax.swing.*;
class Dollartorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Dollar");
	int Dollar=Integer.parseInt(a);
	int rupees=Dollar*160;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
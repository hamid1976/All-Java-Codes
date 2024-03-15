import javax.swing.*;
class Rupeestodollar{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Rupees");
	int Dollar=Integer.parseInt(a);
	int rupees=Dollar/160;
	JOptionPane.showMessageDialog(null,"dollar="+rupees);
	}
}
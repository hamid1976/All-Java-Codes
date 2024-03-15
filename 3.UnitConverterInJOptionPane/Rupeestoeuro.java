import javax.swing.*;
class Rupeestoeuro{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Euro=Integer.parseInt(a);
	int rupees=Euro/196;
	JOptionPane.showMessageDialog(null,"euro="+rupees);
	}
}
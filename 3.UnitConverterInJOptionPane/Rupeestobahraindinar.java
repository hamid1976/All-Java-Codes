import javax.swing.*;
class Rupeestobahraindinar{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Bahraindinar=Integer.parseInt(a);
	int rupees=Bahraindinar/426;
	JOptionPane.showMessageDialog(null,"bahraindinar="+rupees);
	}
}
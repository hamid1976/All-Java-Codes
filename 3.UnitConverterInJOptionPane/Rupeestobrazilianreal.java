import javax.swing.*;
class Rupeestobrazilianreal{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Brazilianreal=Integer.parseInt(a);
	int rupees=Brazilianreal/31;
	JOptionPane.showMessageDialog(null,"brazilianreal="+rupees);
	}
}
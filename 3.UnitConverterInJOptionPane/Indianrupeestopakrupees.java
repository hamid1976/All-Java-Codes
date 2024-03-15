import javax.swing.*;
class Indianrupeestopakrupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("IndianRupees");
	int IndianRupees=Integer.parseInt(a);
	int rupees=IndianRupees*2;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
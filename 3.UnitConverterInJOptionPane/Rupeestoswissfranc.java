import javax.swing.*;
class Rupeestoswissfranc{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Swissfranc=Integer.parseInt(a);
	int rupees=Swissfranc/181;
	JOptionPane.showMessageDialog(null,"swissfranc="+rupees);
	}
}
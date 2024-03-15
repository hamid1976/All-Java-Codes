import javax.swing.*;
class Swissfranctorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Swissfranc");
	int Swissfranc=Integer.parseInt(a);
	int rupees=Swissfranc*181;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
import javax.swing.*;
class Omanirialtorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Omanirial");
	int Omanirial=Integer.parseInt(a);
	int rupees=Omanirial*417;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
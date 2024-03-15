import javax.swing.*;
class Rupeestocanadadollar{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Canadadollar=Integer.parseInt(a);
	int rupees=Canadadollar/125;
	JOptionPane.showMessageDialog(null,"canadadollar="+rupees);
	}
}
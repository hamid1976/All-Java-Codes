import javax.swing.*;
class Canadadollartorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Canadadollar");
	int Canadadollar=Integer.parseInt(a);
	int rupees=Canadadollar*125;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
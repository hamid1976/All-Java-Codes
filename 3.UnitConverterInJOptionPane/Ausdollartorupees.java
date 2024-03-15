import javax.swing.*;
class Ausdollartorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Ausdollar");
	int Ausdollar=Integer.parseInt(a);
	int rupees=Ausdollar*122;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
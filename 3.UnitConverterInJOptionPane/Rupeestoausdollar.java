import javax.swing.*;
class Rupeestoausdollar{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Ausdollar=Integer.parseInt(a);
	int rupees=Ausdollar/122;
	JOptionPane.showMessageDialog(null,"ausdollar="+rupees);
	}
}
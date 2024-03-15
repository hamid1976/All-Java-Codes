import javax.swing.*;
class Libyandollartorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Libyandollar");
	int Libyandollar=Integer.parseInt(a);
	int rupees=Libyandollar*119;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
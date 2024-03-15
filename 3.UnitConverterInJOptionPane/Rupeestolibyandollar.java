import javax.swing.*;
class Rupeestolibyandollar{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Libyandollar=Integer.parseInt(a);
	int rupees=Libyandollar/119;
	JOptionPane.showMessageDialog(null,"libyandollar="+rupees);
	}
}
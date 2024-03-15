import javax.swing.*;
class Malaysianringgittorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Malaysian ringgit");
	int Malaysianringgit=Integer.parseInt(a);
	int rupees=Malaysianringgit*39;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
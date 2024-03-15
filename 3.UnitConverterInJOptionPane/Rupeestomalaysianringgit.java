import javax.swing.*;
class Rupeestomalaysianringgit{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Malaysianringgit=Integer.parseInt(a);
	int rupees=Malaysianringgit/217;
	JOptionPane.showMessageDialog(null,"malaysianringgit="+rupees);
	}
}
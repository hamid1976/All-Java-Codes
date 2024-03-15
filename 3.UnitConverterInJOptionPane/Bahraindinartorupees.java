import javax.swing.*;
class Bahraindinartorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Bahraindinar");
	int Bahraindinar=Integer.parseInt(a);
	int rupees=Bahraindinar*426;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
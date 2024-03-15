import javax.swing.*;
class Rupeestopound{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Rupees");
	int Pound=Integer.parseInt(a);
	int rupees=Pound/217;
	JOptionPane.showMessageDialog(null,"pound="+rupees);
	}
}
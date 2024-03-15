import javax.swing.*;
class Russianrubletorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Russian ruble");
	int Russianruble=Integer.parseInt(a);
	int rupees=Russianruble*2;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
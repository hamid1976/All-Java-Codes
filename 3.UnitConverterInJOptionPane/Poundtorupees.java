import javax.swing.*;
class Poundtorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Pound");
	int Pound=Integer.parseInt(a);
	int rupees=Pound*217;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
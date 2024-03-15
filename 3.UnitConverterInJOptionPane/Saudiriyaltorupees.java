import javax.swing.*;
class Saudiriyaltorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Saudiriyal");
	int Saudiriyal=Integer.parseInt(a);
	int rupees=Saudiriyal*42;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
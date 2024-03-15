import javax.swing.*;
class Philippinepesotorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Philippinepeso");
	int Philippinepeso=Integer.parseInt(a);
	int rupees=Philippinepeso*3;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
import javax.swing.*;
class Eurotorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Euro");
	int Euro=Integer.parseInt(a);
	int rupees=Euro*196;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
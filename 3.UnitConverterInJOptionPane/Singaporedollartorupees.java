import javax.swing.*;
class Singaporedollartorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Singaporedollar");
	int Singaporedollar=Integer.parseInt(a);
	int rupees=Singaporedollar*120;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
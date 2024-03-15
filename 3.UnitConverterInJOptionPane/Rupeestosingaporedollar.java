import javax.swing.*;
class Rupeestosingaporedollar{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Singaporedollar=Integer.parseInt(a);
	int rupees=Singaporedollar/120;
	JOptionPane.showMessageDialog(null,"singaporedollar="+rupees);
	}
}
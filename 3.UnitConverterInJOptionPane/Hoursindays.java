import javax.swing.*;
class Hoursindays{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Hours");
	int Hours=Integer.parseInt(a);
	int days=Hours/24;
	JOptionPane.showMessageDialog(null,"days="+days);
	}
}
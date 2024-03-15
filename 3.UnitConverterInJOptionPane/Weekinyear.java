import javax.swing.*;
class Weekinyear{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Weeks");
	int Weeks=Integer.parseInt(a);
	int year=Weeks/52;
	JOptionPane.showMessageDialog(null,"year="+year);
	}
}
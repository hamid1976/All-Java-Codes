import javax.swing.*;
class Daysinyear{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Days");
	int Days=Integer.parseInt(a);
	int year=Days/365;
	JOptionPane.showMessageDialog(null,"year="+year);
	}
}
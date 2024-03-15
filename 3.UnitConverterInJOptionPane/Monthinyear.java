import javax.swing.*;
class Monthinyear{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Month");
	int Month=Integer.parseInt(a);
	int year=Month/12;
	JOptionPane.showMessageDialog(null,"year="+year);
	}
}
import javax.swing.*;
class Inchtoyard{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Inch");
	int Yard=Integer.parseInt(a);
	int inch=Yard/36;
	JOptionPane.showMessageDialog(null,"yard="+inch);
	}
}
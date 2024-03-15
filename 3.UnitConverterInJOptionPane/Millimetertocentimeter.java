import javax.swing.*;
class Millimetertocentimeter{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Millimeter");
	int Centimeter=Integer.parseInt(a);
	int millimeter=Centimeter/10;
	JOptionPane.showMessageDialog(null,"centimeter="+millimeter);
	}
}
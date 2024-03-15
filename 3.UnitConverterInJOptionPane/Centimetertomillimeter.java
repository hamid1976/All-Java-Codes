import javax.swing.*;
class Centimetertomillimeter{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Centimeter");
	int Centimeter=Integer.parseInt(a);
	int millimeter=Centimeter*10;
	JOptionPane.showMessageDialog(null,"millimeter="+millimeter);
	}
}
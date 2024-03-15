import javax.swing.*;
class Nanometertomilimeter{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Nanometer");
	int Millimeter=Integer.parseInt(a);
	int nanometer=Millimeter/1000000;
	JOptionPane.showMessageDialog(null,"millimeter="+nanometer);
	}
}
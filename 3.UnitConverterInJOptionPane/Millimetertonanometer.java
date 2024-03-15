import javax.swing.*;
class Millimetertonanometer{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Millimeter");
	int Millimeter=Integer.parseInt(a);
	int nanometer=Millimeter*1000000;
	JOptionPane.showMessageDialog(null,"nanometer="+nanometer);
	}
}
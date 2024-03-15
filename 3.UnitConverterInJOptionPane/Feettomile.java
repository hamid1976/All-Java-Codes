import javax.swing.*;
class Feettomile{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Feet ");
	int Mile=Integer.parseInt(a);
	int feet=Mile/5280;
	JOptionPane.showMessageDialog(null,"mile="+feet);
	}
}
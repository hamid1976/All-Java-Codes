import javax.swing.*;
class Inchtofeet{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter inch");
	int Feet=Integer.parseInt(a);
	int inch=Feet/12;
	JOptionPane.showMessageDialog(null,"Feet="+inch);
	}
}
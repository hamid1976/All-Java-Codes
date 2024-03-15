import javax.swing.*;
class Feettoinch{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Feet");
	int Feet=Integer.parseInt(a);
	int inch=Feet*12;
	JOptionPane.showMessageDialog(null,"inch="+inch);
	}
}
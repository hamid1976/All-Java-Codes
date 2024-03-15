import javax.swing.*;
class Feettoyard{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Feet ");
	int Yard=Integer.parseInt(a);
	int feet=Yard/3;
	JOptionPane.showMessageDialog(null,"yard="+feet);
	}
}
import javax.swing.*;
class Yardtofeet{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Yard ");
	int Yard=Integer.parseInt(a);
	int feet=Yard*3;
	JOptionPane.showMessageDialog(null,"feet="+feet);
	}
}
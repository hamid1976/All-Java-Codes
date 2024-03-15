import javax.swing.*;
class Miletofeet{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Mile");
	int Mile=Integer.parseInt(a);
	int feet=Mile*5280;
	JOptionPane.showMessageDialog(null,"feet="+feet);
	}
}
import javax.swing.*;
class Miletoyard{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Mile");
	int Mile=Integer.parseInt(a);
	int yard=Mile*1760;
	JOptionPane.showMessageDialog(null,"yard="+yard);
	}
}
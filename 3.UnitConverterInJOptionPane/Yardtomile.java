import javax.swing.*;
class Yardtomile{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Yard");
	int Mile=Integer.parseInt(a);
	int yard=Mile/1760;
	JOptionPane.showMessageDialog(null,"mile="+yard);
	}
}
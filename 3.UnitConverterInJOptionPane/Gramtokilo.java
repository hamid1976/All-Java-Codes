import javax.swing.*;
class Gramtokilo{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Grams");
	int Kilo=Integer.parseInt(a);
	int grams=Kilo/1000;
	JOptionPane.showMessageDialog(null,"Kilo="+grams);
	}
}
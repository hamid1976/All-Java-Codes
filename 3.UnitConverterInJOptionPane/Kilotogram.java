import javax.swing.*;
class Kilotogram{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Kilo");
	int Kilo=Integer.parseInt(a);
	int grams=Kilo*1000;
	JOptionPane.showMessageDialog(null,"grams="+grams);
	}
}
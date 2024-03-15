import javax.swing.*;
class Tonnetokilogram{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Tonne");
	int Kilogram=Integer.parseInt(a);
	int tonne=Kilogram/1000;
	JOptionPane.showMessageDialog(null,"kilogram="+tonne);
	}
}
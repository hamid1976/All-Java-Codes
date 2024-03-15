import javax.swing.*;
class Kilogramtotonne{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Kilogram");
	int Kilogram=Integer.parseInt(a);
	int tonne=Kilogram*1000;
	JOptionPane.showMessageDialog(null,"tonne="+tonne);
	}
}
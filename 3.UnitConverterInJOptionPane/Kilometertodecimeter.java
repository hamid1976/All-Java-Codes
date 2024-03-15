import javax.swing.*;
class Kilometertodecimeter{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Kilometer");
	int Kilometer=Integer.parseInt(a);
	int decimeter=Kilometer*10000;
	JOptionPane.showMessageDialog(null,"decimeter="+decimeter);
	}
}
import javax.swing.*;
class Decimetertokilometer{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Decimeter");
	int kilometer=Integer.parseInt(a);
	int decimeter=kilometer/10000;
	JOptionPane.showMessageDialog(null,"kilometer="+decimeter);
	}
}
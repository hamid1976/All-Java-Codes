import javax.swing.*;
class Tonnetostone{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Tonne");
	int Tonne=Integer.parseInt(a);
	int stone=Tonne*157;
	JOptionPane.showMessageDialog(null,"stone="+stone);
	}
}
import javax.swing.*;
class Stonetotonne{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Stone");
	int Tonne=Integer.parseInt(a);
	int stone=Tonne/ 157;
	JOptionPane.showMessageDialog(null,"tonne="+stone);
	}
}
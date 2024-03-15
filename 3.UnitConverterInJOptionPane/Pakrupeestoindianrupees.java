import javax.swing.*;
class Pakrupeestoindianrupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("PakRupees ");
	int Indianrupees=Integer.parseInt(a);
	int rupees=Indianrupees/2;
	JOptionPane.showMessageDialog(null,"indianrupees="+rupees);
	}
}
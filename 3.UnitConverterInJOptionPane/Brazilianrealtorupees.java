import javax.swing.*;
class Brazilianrealtorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Brazilianreal");
	int Brazilianreal=Integer.parseInt(a);
	int rupees=Brazilianreal*31;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
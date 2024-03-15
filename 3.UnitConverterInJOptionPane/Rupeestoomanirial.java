import javax.swing.*;
class Rupeestoomanirial{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Omanirial=Integer.parseInt(a);
	int rupees=Omanirial/417;
	JOptionPane.showMessageDialog(null,"omanirial="+rupees);
	}
}
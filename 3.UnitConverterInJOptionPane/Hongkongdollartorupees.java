import javax.swing.*;
class Hongkongdollartorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Hongkongdollar");
	int Hongkongdollar=Integer.parseInt(a);
	int rupees=Hongkongdollar*20;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
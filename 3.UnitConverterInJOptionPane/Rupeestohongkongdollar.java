import javax.swing.*;
class Rupeestohongkongdollar{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Hongkongdollar=Integer.parseInt(a);
	int rupees=Hongkongdollar/20;
	JOptionPane.showMessageDialog(null,"hongkongdollar="+rupees);
	}
}
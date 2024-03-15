import javax.swing.*;
class Yardtoinch{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Yard");
	int Yard=Integer.parseInt(a);
	int inch=Yard*36;
	JOptionPane.showMessageDialog(null,"inch="+inch);
	}
}
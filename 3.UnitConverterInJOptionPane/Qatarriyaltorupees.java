import javax.swing.*;
class 	Qatarriyaltorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Qatarriyal");
	int Qatarriyal=Integer.parseInt(a);
	int rupees=Qatarriyal*44;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
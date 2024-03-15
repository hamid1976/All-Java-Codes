import javax.swing.*;
class Emritdirhamtorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Rupees");
	int Emritdirham=Integer.parseInt(a);
	int rupees=Emritdirham/43;
	JOptionPane.showMessageDialog(null,"emritdirham="+rupees);
	}
}
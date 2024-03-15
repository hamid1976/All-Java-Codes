import javax.swing.*;
class Emritdirhamartorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Emritdirham");
	int Emritdirham=Integer.parseInt(a);
	int rupees=Emritdirham*43;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
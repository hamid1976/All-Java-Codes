import javax.swing.*;
class Newzealanddollartorupees{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Newzealanddollar");
	int Newzealanddollar=Integer.parseInt(a);
	int rupees=Newzealanddollar*114;
	JOptionPane.showMessageDialog(null,"rupees="+rupees);
	}
}
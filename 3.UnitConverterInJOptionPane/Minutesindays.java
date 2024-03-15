import javax.swing.*;
class Minutesindays{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Minutes");
	int Minutes=Integer.parseInt(a);
	int days=Minutes/1440;
	JOptionPane.showMessageDialog(null,"days="+days);
	}
}
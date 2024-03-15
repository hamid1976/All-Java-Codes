import javax.swing.*;
class Daysinmonth{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Days");
	int Days=Integer.parseInt(a);
	int month=Days/30;
	JOptionPane.showMessageDialog(null,"month="+month);
	}
}
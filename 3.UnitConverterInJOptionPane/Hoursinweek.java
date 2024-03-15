import javax.swing.*;
class Hoursinweek{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Hours");
	int Hours=Integer.parseInt(a);
	int week=Hours/ 168;
	JOptionPane.showMessageDialog(null,"week="+week);
	}
}
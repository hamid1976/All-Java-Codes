import javax.swing.*;
class Daysinweek{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Day");
	int Day=Integer.parseInt(a);
	int week=Day/7;
	JOptionPane.showMessageDialog(null,"week="+week);
	}
}
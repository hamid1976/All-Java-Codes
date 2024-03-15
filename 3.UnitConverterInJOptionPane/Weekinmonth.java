import javax.swing.*;
class Weekinmonth{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Week");
	int Week=Integer.parseInt(a);
	int month=Week/4;
	JOptionPane.showMessageDialog(null,"month="+month);
	}
}
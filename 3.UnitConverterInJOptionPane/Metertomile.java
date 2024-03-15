import javax.swing.*;
class Metertomile{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Meter");
	int Mile=Integer.parseInt(a);
	int meter=Mile/1609;
	JOptionPane.showMessageDialog(null,"mile="+meter);
	}
}
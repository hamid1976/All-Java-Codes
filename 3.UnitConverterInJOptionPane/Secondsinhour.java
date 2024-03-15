import javax.swing.*;
class Secondsinhour{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("EnterSeconds");
	int Seconds=Integer.parseInt(a);
	int hour=Seconds/3600;
	JOptionPane.showMessageDialog(null,"hour="+hour);
	}
}
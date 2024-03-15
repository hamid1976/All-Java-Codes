import javax.swing.*;
class Miletometer{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Mile");
	int Mile=Integer.parseInt(a);
	int meter=Mile*1609;
	JOptionPane.showMessageDialog(null,"meter="+meter);
	}
}
import javax.swing.*;
class Addition{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter first Number");
	int first=Integer.parseInt(a);
	String b=JOptionPane.showInputDialog("Enter second Number");
	int second=Integer.parseInt(b);
	JOptionPane.showMessageDialog(null,"Addition="+(first+second));
}
}
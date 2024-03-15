import javax.swing.*;

class Book{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter selled Books");
		
		int Books=Integer.parseInt(s1);
		int s2=Books*100;
		
		JOptionPane.showMessageDialog(null,"Books selled price: "+s2);
		
	}
}
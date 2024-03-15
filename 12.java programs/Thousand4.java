import javax.swing.*;

class Thousand1{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Thousand ?");
		
		int Thousand=Integer.parseInt(s1);
		int s2=Thousand/5;
		
		JOptionPane.showMessageDialog(null," five will be"+s2);
		
	}
}
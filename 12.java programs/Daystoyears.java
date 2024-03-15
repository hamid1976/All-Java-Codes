import javax.swing.*;

class Daystoyears{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Days?");
		
		int Days=Integer.parseInt(s1);
		int s2=Days/365;
		
		JOptionPane.showMessageDialog(null,"Years will be"+s2);
		
	}
}
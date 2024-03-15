import javax.swing.*;

class Daytoweek{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Days?");
		
		int Days=Integer.parseInt(s1);
		int s2=Days/7;
		
		JOptionPane.showMessageDialog(null,"Week will be"+s2);
		
	}
}

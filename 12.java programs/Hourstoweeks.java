import javax.swing.*;

class Hourstoweeks{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Hours ?");
		
		int Days=Integer.parseInt(s1);
		int s2=Days/168;
		
		JOptionPane.showMessageDialog(null,"Weeks will be"+s2);
		
	}
}
import javax.swing.*;

class Minutestoweeks{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Minutes ?");
		
		int minutes=Integer.parseInt(s1);
		int s2=minutes/10080;
		
		JOptionPane.showMessageDialog(null,"Weeks will be"+s2);
		
	}
}
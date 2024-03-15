import javax.swing.*;

class secondstoweeks{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Seconds ?");
		
		int seconds=Integer.parseInt(s1);
		int s2=seconds/604800;
		
		JOptionPane.showMessageDialog(null,"Weeks will be"+s2);
		
	}
}
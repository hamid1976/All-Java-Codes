import javax.swing.*;

class Hourstodays{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Hours ?");
		
		int Days=Integer.parseInt(s1);
		int s2=Days/24;
		
		JOptionPane.showMessageDialog(null,"Days will be"+s2);
		
	}
}
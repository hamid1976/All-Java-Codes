import javax.swing.*;

class Daystoseconds{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Days?");
		
		int Days=Integer.parseInt(s1);
		int s2=Days*604800;
		
		JOptionPane.showMessageDialog(null,"Seconds will be"+s2);
		
	}
}
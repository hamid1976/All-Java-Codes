import javax.swing.*;

class Weekstosecond{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Weeks?");
		
		int Weeks=Integer.parseInt(s1);
		int s2=Weeks*604800;
		
		JOptionPane.showMessageDialog(null,"second will be: "+s2);
		
	}
}
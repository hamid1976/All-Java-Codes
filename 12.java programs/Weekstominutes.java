import javax.swing.*;

class Weektominutes{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Weeks?");
		
		int Weeks=Integer.parseInt(s1);
		int s2=Weeks*10080;
		
		JOptionPane.showMessageDialog(null,"Minutes will be: "+s2);
		
	}
}
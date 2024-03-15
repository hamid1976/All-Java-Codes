import javax.swing.*;

class years1{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter years?");
		
		int weeks=Integer.parseInt(s1);
		int s2=weeks*52;
		
		JOptionPane.showMessageDialog(null,"weeks will be: "+s2);
		
	}
}
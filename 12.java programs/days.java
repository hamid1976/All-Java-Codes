import javax.swing.*;

class days{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Days?");
		
		
		int hour=Integer.parseInt(s1);
		int s2=hour*24;
		
		JOptionPane.showMessageDialog(null,"Hour will be: "+s2 );
	}
}
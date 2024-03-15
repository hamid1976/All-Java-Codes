import javax.swing.*;

class day{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Days?");
		
		int weeks=Integer.parseInt(s1);
		int s2=weeks/7;
		
		
		JOptionPane.showMessageDialog(null,"weeks will be: "+s2);
		
	}
}
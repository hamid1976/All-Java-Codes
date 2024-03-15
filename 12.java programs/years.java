import javax.swing.*;

class years{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter years?");
		
		int days=Integer.parseInt(s1);
		int s2=days*365;
		
		JOptionPane.showMessageDialog(null,"days will be: "+s2);
		
	}
}
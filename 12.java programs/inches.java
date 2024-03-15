import javax.swing.*;

class inches{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Inches?");
		
		
		
		int feet=Integer.parseInt(s1);
		int s2=feet/12;
		
		
		JOptionPane.showMessageDialog(null,"Feet will be: "+s2);
		
	}
}
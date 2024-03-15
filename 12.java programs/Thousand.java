import javax.swing.*;

class Thousand{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Thousand ?");
		
		int Thousand=Integer.parseInt(s1);
		int s2=Thousand/10;
		
		JOptionPane.showMessageDialog(null," Tens will be"+s2);
		
	}
}
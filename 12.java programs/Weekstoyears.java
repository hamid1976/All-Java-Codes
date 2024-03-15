import javax.swing.*;

class Weekstoyears{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Week");
		
		int weeks=Integer.parseInt(s1);
		int s2=weeks/52;
		
		JOptionPane.showMessageDialog(null,"Years will be"+s2);
		
	}
}
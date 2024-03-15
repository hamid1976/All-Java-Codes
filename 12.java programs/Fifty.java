import javax.swing.*;

class Fifty{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Fifty  ?");
		
		int fifty=Integer.parseInt(s1);
		int s2=fifty/10;
		
		JOptionPane.showMessageDialog(null," Tens will be"+s2);
		
	}
}
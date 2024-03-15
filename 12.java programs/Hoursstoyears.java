import javax.swing.*;

class Hourstoyears{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Hours Days?");
		
		int Days=Integer.parseInt(s1);
		int s2=Days/8760;
		
		JOptionPane.showMessageDialog(null,"Years will be"+s2);
		
	}
}
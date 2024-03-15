import javax.swing.*;

class Hundred1{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Hundred ?");
		
		int hundred=Integer.parseInt(s1);
		int s2=hundred/50;
		
		JOptionPane.showMessageDialog(null," fifty will be"+s2);
		
	}
}
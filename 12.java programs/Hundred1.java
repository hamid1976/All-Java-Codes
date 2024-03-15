import javax.swing.*;

class Hundred1{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Hundred ?");
		
		int hundred=Integer.parseInt(s1);
		int s2=hundred/10;
		
		JOptionPane.showMessageDialog(null," Tens will be"+s2);
		
	}
}
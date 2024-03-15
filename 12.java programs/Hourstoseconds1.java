import javax.swing.*;

class Hourstoseconds1{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Hours ?");
		
		int hours=Integer.parseInt(s1);
		int s2=hours*3600;
		
		JOptionPane.showMessageDialog(null,"Seconds will be"+s2);
		
	}
}
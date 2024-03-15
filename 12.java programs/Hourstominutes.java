import javax.swing.*;

class Hourstominutes{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Hours ?");
		
		int Days=Integer.parseInt(s1);
		int s2=Days*1440;
		
		JOptionPane.showMessageDialog(null,"minutes will be"+s2);
		
	}
}
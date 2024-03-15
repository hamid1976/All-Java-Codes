import javax.swing.*;

class secondstoyears1{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Seconds ?");
		
		int seconds=Integer.parseInt(s1);
		int s2=seconds/31536000;
		
		JOptionPane.showMessageDialog(null,"Years will be"+s2);
		
	}
}
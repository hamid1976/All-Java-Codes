import javax.swing.*;

class secondstohours{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Seconds ?");
		
		int seconds=Integer.parseInt(s1);
		int s2=seconds/3600;
		
		JOptionPane.showMessageDialog(null,"Hours will be"+s2);
		
	}
}
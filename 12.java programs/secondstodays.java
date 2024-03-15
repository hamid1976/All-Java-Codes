import javax.swing.*;

class secondstodays{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Seconds ?");
		
		int seconds=Integer.parseInt(s1);
		int s2=seconds/86400;
		
		JOptionPane.showMessageDialog(null,"Days will be"+s2);
		
	}
}
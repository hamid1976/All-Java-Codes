import javax.swing.*;

class Yearstohours{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Years?");
		
		int Years=Integer.parseInt(s1);
		int hours=Years*525600;
		
		JOptionPane.showMessageDialog(null,"Hours will be: "+hours);
		
	}
}
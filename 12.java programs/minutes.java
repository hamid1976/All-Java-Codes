import javax.swing.*;

class minutes{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter minutes?");
		
		int second=Integer.parseInt(s1);
		int s2=second*60;
		
		JOptionPane.showMessageDialog(null,"Second will be: "+s2);
		
	}
}
import javax.swing.*;

class yeartoweek{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter year?");
		
		int weeks=Integer.parseInt(s1);
		int s2=weeks*52;
		
		JOptionPane.showMessageDialog(null,"week will be: "+s2);
		
	}
}
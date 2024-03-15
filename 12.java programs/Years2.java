import javax.swing.*;

class Years2{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Years?");
		
		int years=Integer.parseInt(s1);
		int s2=years*52;
		
		JOptionPane.showMessageDialog(null,"weeks will be: "+s2);
		
	}
}
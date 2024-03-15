import javax.swing.*;

class hours{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Hours?");
		
		int days=Integer.parseInt(s1);
		int s2=days/24;
		
		
		JOptionPane.showMessageDialog(null,"Days will be: "+s2);
		
	}
}
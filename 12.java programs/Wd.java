import javax.swing.*;

class Wd{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Days?");
		
		int s2=Integer.parseInt(s1);
		int s3=s2/7;
		int s4=s2%7;
		
		JOptionPane.showMessageDialog(null,"Weeks will be: "+s3+"\n Remaindar will be: "+s4);
		
	}
}
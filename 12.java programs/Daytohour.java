import javax.swing.*;

class Daytohour{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Days?");
		
		int Days=Integer.parseInt(s1);
		int s2=Days*24;
		
		JOptionPane.showMessageDialog(null,"Hours will be"+s2);
		
	}
}
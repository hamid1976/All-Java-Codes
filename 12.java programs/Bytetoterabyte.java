import javax.swing.*;

class Bytetoterabyte{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Byte ?");
		
		int Byte=Integer.parseInt(s1);
		int s2=Byte/1024;
		
		JOptionPane.showMessageDialog(null,"Terabyte will be"+s2);
		
	}
}
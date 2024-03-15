import javax.swing.*;

class Bytetomegabyte{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Byte ?");
		
		int Byte=Integer.parseInt(s1);
		int s2=Byte/1048576;
		
		JOptionPane.showMessageDialog(null,"Megabyte will be "+s2);
		
	}
}
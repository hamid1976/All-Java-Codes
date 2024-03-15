import javax.swing.*;

class Bytetokilobyte{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Byte ?");
		
		int Byte=Integer.parseInt(s1);
		int s2=Byte/1024;
		
		JOptionPane.showMessageDialog(null,"Kilobyte will be"+s2);
		
	}
}
import javax.swing.*;

class Bytetogagabyte{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Byte ?");
		
		short Byte=Integer.parseInt(s1);
		short s2=Byte/1073741824;
		
		JOptionPane.showMessageDialog(null,"Gagabyte will be"+s2);
		
	}
}
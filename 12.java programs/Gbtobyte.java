import javax.swing.*;

class Gbtobyte{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Gagabyte ?");
		
		int Megabyte=Integer.parseInt(s1);
		int s2=Megabyte*1073741824;
		
		JOptionPane.showMessageDialog(null,"Byte will be"+s2);
		
	}
}
import javax.swing.*;

class Mbtobyte{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Megabyte ?");
		
		int Megabyte=Integer.parseInt(s1);
		int s2=Megabyte*1048576;
		
		JOptionPane.showMessageDialog(null,"Byte will be"+s2);
		
	}
}
import javax.swing.*;

class Mbtokb{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Megabyte ?");
		
		int Megabyte=Integer.parseInt(s1);
		int s2=Megabyte*1024;
		
		JOptionPane.showMessageDialog(null,"MegaByte will be"+s2);
		
	}
}
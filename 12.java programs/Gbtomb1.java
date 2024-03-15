import javax.swing.*;

class Gbtomb1{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Gagabyte ?");
		
		int Megabyte=Integer.parseInt(s1);
		int s2=Megabyte*1024;
		
		JOptionPane.showMessageDialog(null,"MegaByte will be"+s2);
		
	}
}
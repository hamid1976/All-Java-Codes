import javax.swing.*;

class Gbtokb{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Gagabyte ?");
		
		int Megabyte=Integer.parseInt(s1);
		int s2=Megabyte*1048576;
		
		JOptionPane.showMessageDialog(null,"KiloByte will be"+s2);
		
	}
}
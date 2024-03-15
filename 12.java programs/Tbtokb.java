import javax.swing.*;

class Tbtokb{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Terabyte ?");
		
		int Terabyte=Integer.parseInt(s1);
		int s2=Terabyte*1073741824;
		
		JOptionPane.showMessageDialog(null,"Kilobyte will be"+s2);
		
	}
}
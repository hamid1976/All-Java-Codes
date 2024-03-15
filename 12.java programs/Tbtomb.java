import javax.swing.*;

class Tbtomb{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Terabyte ?");
		
		int Terabyte=Integer.parseInt(s1);
		int s2=Terabyte*1048576;
		
		JOptionPane.showMessageDialog(null,"Megabyte will be"+s2);
		
	}
}
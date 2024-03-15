import javax.swing.*;

class Mbtogb{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Megabyte ?");
		
		int Megabyte=Integer.parseInt(s1);
		int s2=Megabyte/1024;
		
		JOptionPane.showMessageDialog(null,"GagaByte will be"+s2);
		
	}
}
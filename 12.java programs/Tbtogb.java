import javax.swing.*;

class Tbtogb{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Terabyte ?");
		
		int Terabyte=Integer.parseInt(s1);
		int s2=Terabyte*1024;
		
		JOptionPane.showMessageDialog(null,"Gagabyte will be"+s2);
		
	}
}
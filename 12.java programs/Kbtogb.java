import javax.swing.*;

class Kbtogb{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Kilobyte ?");
		
		int Kilobyte=Integer.parseInt(s1);
		int s2=Kilobyte/1048576;
		
		JOptionPane.showMessageDialog(null,"Gagabyte will be"+s2);
		
	}
}
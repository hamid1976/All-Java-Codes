import javax.swing.*;

class Kbtotb{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Kilobyte ?");
		
		int Kilobyte=Integer.parseInt(s1);
		int s2=Kilobyte/1073741824;
		
		JOptionPane.showMessageDialog(null,"Terabyte will be"+s2);
		
	}
}
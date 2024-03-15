import javax.swing.*;

class Kilobytetobyte{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Kilobyte ?");
		
		int Byte=Integer.parseInt(s1);
		int s2=Byte*1024;
		
		JOptionPane.showMessageDialog(null,"byte will be"+s2);
		
	}
}
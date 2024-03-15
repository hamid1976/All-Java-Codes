import javax.swing.*;

class Kilobytetomegabyte{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Kilobyte ?");
		
		int Byte=Integer.parseInt(s1);
		int s2=Byte/109951162776;
		
		JOptionPane.showMessageDialog(null,"Megabyte
		will be"+s2);
		
	}
}
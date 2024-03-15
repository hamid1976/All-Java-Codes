import javax.swing.*;

class Rupeestodollors{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Rupees ?");
		
		int Byte=Integer.parseInt(s1);
		int s2=Byte/155;
		
		JOptionPane.showMessageDialog(null,"Dollors will be"+s2);
		
	}
}
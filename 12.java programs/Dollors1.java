import javax.swing.*;

class Dollors1{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Rupees ?");
		
		int dollor=Integer.parseInt(s1);
		int s2=dollor/155;
		
		JOptionPane.showMessageDialog(null,"Dollors will be"+s2);
		
	}
}
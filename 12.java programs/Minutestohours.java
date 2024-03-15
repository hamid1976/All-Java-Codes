import javax.swing.*;

class Minutestohours{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Minutes ?");
		
		int munites=Integer.parseInt(s1);
		int s2=munites*1440;
		
		JOptionPane.showMessageDialog(null,"Hours will be"+s2);
		
	}
}
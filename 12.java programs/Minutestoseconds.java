import javax.swing.*;

class Minutestoseconds{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Minutes ?");
		
		int munites=Integer.parseInt(s1);
		int s2=munites*60;
		
		JOptionPane.showMessageDialog(null,"Seconds will be"+s2);
		
	}
}
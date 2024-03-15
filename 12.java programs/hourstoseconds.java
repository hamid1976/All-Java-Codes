import javax.swing.*;

class hourstoseconds{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter hours?");
		
		int seconds=Integer.parseInt(s1);
		int s2=seconds*3600;
		
		JOptionPane.showMessageDialog(null,"seconds: "+s2);
		
	}
}
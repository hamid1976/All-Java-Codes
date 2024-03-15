import javax.swing.*;

class second {
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter second?");
		
		int minutes=Integer.parseInt(s1);
		int s2=minutes/60;
		
		JOptionPane.showMessageDialog(null,"minutes will be: "+s2);
		
	}
}
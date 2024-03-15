import javax.swing.*;

class grams{
	
	public static void main(String arg[]){
		
		
		String s1= JOptionPane.showInputDialog("Enter grams?");
		
		int kilo=Integer.parseInt(s1);
		int s2=kilo/1000;
		
		JOptionPane.showMessageDialog(null,"kilo will be: "+s2);
		
		
	}
}
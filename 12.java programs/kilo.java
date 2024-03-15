import javax.swing.*;

class kilo{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter kilo?");
		
		int grams=Integer.parseInt(s1);
		int s2=grams*1000;
		
		JOptionPane.showMessageDialog(null,"Grams will be: "+s2);
		
		
	}
}
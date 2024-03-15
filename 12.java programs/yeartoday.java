import javax.swing.*;

class yeartoday{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter year?");
		
		int day=Integer.parseInt(s1);
		int s2=day*365;
		
		JOptionPane.showMessageDialog(null,"day will be: "+s2);
		
	}
}
import javax.swing.*;

class secondstominutes{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Seconds ?");
		
		int seconds=Integer.parseInt(s1);
		int s2=seconds/60;
		
		JOptionPane.showMessageDialog(null,"Minutes will be"+s2);
		
	}
}
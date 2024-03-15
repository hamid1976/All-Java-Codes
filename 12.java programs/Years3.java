import javax.swing.*;

class Years3{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Years?");
		
		int Years=Integer.parseInt(s1);
		int s2=Years*365;
		
		JOptionPane.showMessageDialog(null,"Days will be: "+s2);
		
	}
}
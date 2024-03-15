import javax.swing.*;

class Yearstominutes{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Years?");
		
		int Years=Integer.parseInt(s1);
		int s2=Years*525600;
		
		JOptionPane.showMessageDialog(null,"Minutes will be: "+s2);
		
	}
}
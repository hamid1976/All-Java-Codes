import javax.swing.*;

class Yearstosecond{
	
	public static void main(String arg[]){
		
	
	String s1= JOptioonPane.showInputDialog("Enter second");
	
	int Years=Integer.parseInt(s1);
	int second=Years*31536000;
	
	JOptionPane.showMessageDialog(null,"seconds will be: "+second);
	
	}
}
 
 
	
	
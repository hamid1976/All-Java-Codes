import javax.swing.*;

class day1{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter days ?");
		
		int second=Integer.parseInt(s1);
		int s2=second*3600;
	
        JOptionPane.showMessageDialog(null,"second will be: "+s2);	
	    
		
	}
}
import javax.swing.*;

class weeks{

    public static void main(String arg[]){
	

	    String s1= JOptionPane.showInputDialog("Enter weeks?");
			
			
		int days=Integer.parseInt(s1);
		int s2=days*7;
		
		
		JOptionPane.showMessageDialog(null,"Days will be: "+s2);
		
		
	}
}


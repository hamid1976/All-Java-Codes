import javax.swing.*;

class Weekstodays{
	
    public static void main(String arg[]){
	
	String s1= JOptionPane.showInputDialog("Enter Weeks?");
	
	int Weeks=Integer.parseInt(s1);
	int s2=Weeks/7;
	
	JOptionPane.showMessageDialog(null,"Days will be: "+s2);
	

	}
}

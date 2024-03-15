import javax.swing.*;

class Weekstohours{
	
	public static void main(String arg[]){
		
	 String s1= JOptionPane.showInputDialog("Enter Weeks?");
	 
	 int Weeks=Integer.parseInt(s1);
	 int s2=Weeks*168;
	 
	 JOptionPane.showMessageDialog(null,"Hours will be: "+s2);
	 
	}
}
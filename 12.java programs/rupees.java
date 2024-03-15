import javax.swing.*;

class rupees{
	
	public static void main(String arg[]){
	 
	 String s1= JOptionPane.showInputDialog("Enter Rupees?");
	
	
	 int Dollors=Integer.parseInt(s1);
	 int s2=Dollors/155;
	 
	 JOptionPane.showMessageDialog(null,"Dollors will be: "+s2);
	 
     }
}
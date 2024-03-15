import javax.swing.*;

class Dollortorupees{
	
	public static void main(String arg[]){
		
		String s1=JOptionPane.showInputDialog("Enter Dollors ?");
		
		int dollor=Integer.parseInt(s1);
		
		int rupees=dollor*155;
		
		JOptionPane.showMessageDialog(null,"Rupees will be: "+rupees);
	}
}
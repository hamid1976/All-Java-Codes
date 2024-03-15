import javax.swing.*;

class rl{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Rupees");
		
		int Riyal=Integer.parseInt(s1);
		int Rupees=Riyal/55;
		int Dollors=Riyal*155;
		int Darm=Riyal*50;
		
		
		JOptionPane.showMessageDialog(null,"Rupees will be: "+Rupees+"\nDollors will be: "+Dollors+"\nDarm will be: "+Darm);
		
	}
}
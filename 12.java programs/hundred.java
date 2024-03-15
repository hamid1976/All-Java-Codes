import javax.swing.*;

class hundred{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter thousand?");
        String s2= JOptionPane.showInputDialog("Enter 2nd thousand?");	
		String s3= JOptionPane.showInputDialog("Enter 3nd thousand");
        		
		
		int tens=Integer.parseInt(s1);
		int s4=tens/10;
		
		int fifty=Integer.parseInt(s2);
		int s5=fifty/50;
		
		int hundred=Integer.parseInt(s3);
		int s6=hundred/100;
		
		JOptionPane.showMessageDialog(null,"Tens will be: "+s4+"\nfifly will be: "+s5+"\nHundred will be: "+s6);
		
	}
}
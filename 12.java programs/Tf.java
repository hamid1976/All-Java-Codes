import javax.swing.*;

class Tf{
	
	
	public static void main(String arg[]){
	
		 
		String s1= JOptionPane.showInputDialog("Enter Five Thousand?");
		
		int Thousand=Integer.parseInt(s1);
		int thousand=Thousand/1000;
		int remainder=Thousand&1000;
		int hundred=Thousand/100;
		int fifty=Thousand/50;
		int tens=Thousand/10;
		int five=Thousand/5;
		
		JOptionPane.showMessageDialog(null,"Thousand will be: "+thousand+"\nRemainder will be: "+remainder+"\nHundred will be: "+hundred+"\nFiflt will be: "+fifty+"\nTens will be: "+tens+"\nFive Will be: "+five);
		
	}
}
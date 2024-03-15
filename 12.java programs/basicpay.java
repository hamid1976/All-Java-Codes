import javax.swing.*;

class Basicpay{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Basic psy ?");
		
		int Basic=Integer.parseInt(s1);
		int houseRat=(Basic*45)/100;
		int medical=(Basic*15)/100;
		int bouns=(Basic*8)/100;
		int Grosspay=(houseRat+medical+bouns);
		int IncomeTax=(Basic*10)/100;
		int zakat=(Basic*2)/100;
		int NetIncome
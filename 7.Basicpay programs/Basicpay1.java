import javax.swing.*;

class Basicpay1
{
	public static void main(String arg[])
	{
		String a=JOptionPane.showInputDialog("Enter Employ basic pay");
	
		int Employbasicpay=Integer.parseInt(a);
		
		int Medicalallowance=15*Employbasicpay/100;
		int Houserent=45*Employbasicpay/100;
		int Bonus=5*Employbasicpay/100;
		int Grosspay=(Employbasicpay+Medicalallowance+Houserent+Bonus);
		int Incometax=5*Employbasicpay/100;
		int Zakat=3*Employbasicpay/100;
		int Convenceallowance=8*Employbasicpay/100;
		int Networth=Grosspay-(Incometax+Zakat+Convenceallowance);
		
		JOptionPane.showMessageDialog(null,"Medicalallowance 15% ="+(Medicalallowance)+
		"\n Houserent 45% ="+(Houserent)+"\n Bonus 5% ="+(Bonus)+"\n Grosspay="+(Grosspay)+
		"\n Incometax 5% ="+(Incometax)+"\n Zakat 3% ="+(Zakat)+"\n Convenceallowance 8% ="+(Convenceallowance)+"\n Networth="+(Networth));		
	}
}	
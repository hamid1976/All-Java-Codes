import javax.swing.*;
class Basicpay{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter basic pay");
	int basicpay=Integer.parseInt(a);
	int medicalallowance=15*basicpay/100;
	int houserent=45*basicpay/100;
	int bonus=5*basicpay/100;
	int grosspay=(basicpay+medicalallowance+houserent+bonus);
	int incometax=5*basicpay/100;
	int zakat=3*basicpay/100;
	int convenceallowance=8*basicpay/100;
	int networth=grosspay-(incometax+zakat+convenceallowance);
	
	JOptionPane.showMessageDialog(null,"medicalallowance 15% ="+(medicalallowance)+
	"\n houserent 45% ="+(houserent)+"\n bonus 5% ="+(bonus)+"\n grosspay="+(grosspay)+
	"\n incometax 5% ="+(incometax)+"\n zakat 3% ="+(zakat)+"\n convenceallowance 8% ="+(convenceallowance)+"\n networth="+(networth));
	
	}
}	
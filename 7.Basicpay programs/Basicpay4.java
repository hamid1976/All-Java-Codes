import java.util.*;
class Basicpay4{
	public static void main(String arg[])
		{
			Scanner ob=new Scanner(System.in);
			
			System.out.print("Enter Employee Basic pay?");
            int Employbasicpay=ob.nextInt();
			
		int Medicalallowance=15*Employbasicpay/100;
		int Houserent=45*Employbasicpay/100;
		int Bonus=5*Employbasicpay/100;
		int Grosspay=(Employbasicpay+Medicalallowance+Houserent+Bonus);
		int Incometax=5*Employbasicpay/100;
		int Zakat=2*Employbasicpay/100;
		int Convenceallowance=8*Employbasicpay/100;
		int Networth=Grosspay-(Incometax+Zakat+Convenceallowance);
		
		    System.out.println("Medicalallowance:"+(Medicalallowance));
			System.out.println("Houserent:"+(Houserent));
			System.out.println("Bonus:"+(Bonus));
			System.out.println("Grosspay:"+(Grosspay));
			System.out.println("Incometax:"+(Incometax));
			System.out.println("Zakat:"+(Zakat));
			System.out.println("Convenceallowance:"+(Convenceallowance));
			System.out.println("Networth:"+(Networth));
			
		}
		
}
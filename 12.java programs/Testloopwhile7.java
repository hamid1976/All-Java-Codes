import java.util.*;

class Testloopwhile7{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Employees Salary Calculation ");
			int employee=as.nextInt();
			
			int house=employee*45/100;
			int medical=employee*15/100;
			int bonns=employee*5/100;
			int grosspay=employee+house+medical+bonns;
			double zukat=employee*2.5/100;
			int incometax=employee*3/100;
			int convance=employee*8/100;
			
			System.out.println("House Rent 45%: "+house+"\nMedical Allowance 15%: "+medical+"\nBonns 5%: "+bonns+"\nGross pay: "+grosspay+"\nZukat 2.5: "+zukat+"\nIncome Tax: "+incometax+"\nConvance Allowance 8%: "+convance);
			
			System.out.print("Do you want to run this system again Enter the y/n ");
			ch=as.next().charAt(0);
			
			
			
			
			
		}
		
		
		
		
	}
}
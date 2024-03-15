import java.util.*;

class Testloopwhile6{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter Troly load ");
			int a=as.nextInt();
			
			int TotalIncome=a*800;
			int Driver=a*150;
			int Tax=TotalIncome*10/100;
			int Disel=a*210;
			int profit=TotalIncome-(Driver+Tax+Disel);
			
			System.out.println("Total Income will be: "+TotalIncome);
			System.out.println("Driver will be: "+Driver);
			System.out.println("Tax will be: "+Tax);
			System.out.println("Disel will be: "+Disel);
			System.out.println("Prifit will be: "+profit);
			
			System.out.println("Do you want to run this system again Enter the y/n ");
			ch=as.next().charAt(0);
			
			
		}
		
		
		
		
	}
}
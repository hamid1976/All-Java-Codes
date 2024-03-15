import java.util.*;

class Trolyload1{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Troly load ");
		int a = as.nextInt();
		
		int TotalIncome=a*800;
		int Drive=a*150;
		int Tax=TotalIncome*10/100;
		int Disel=a*210;
		int profit=TotalIncome-(Drive+Tax+Disel);
		
		System.out.print("Total Income will be: "+TotalIncome);
		System.out.print("\nDrive will be: "+Drive);
		System.out.print("\nTax will be: "+Tax);
		System.out.print("\nDisel will be: "+Disel);
		System.out.print("\nprofit will be: "+profit);
	}
}

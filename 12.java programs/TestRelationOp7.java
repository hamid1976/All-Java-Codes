import java.util.*;

class TestRelationOp7{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.println("1.Feet To Inch\n2.Inch To feet\n3.Kilo To Gram\n4.Gram To Kilo\n5.Mark sheet\n6.Troly load\n7.Employees Salary calculator\n");
		
		System.out.print("Enter Selection ?  ");
		int a=as.nextInt();
		
		if(a==1){
			System.out.print("Enter Feet ? ");
			int b=as.nextInt();
			
			int Inch=b*12;
			System.out.print("Inch will be: "+Inch);
		}
		if(a==2){
			System.out.print("Enter Inch ? ");
			int c=as.nextInt();
			
			int Feet=c/12;
			System.out.print("Inch will be: "+Feet);
		}
		if(a==3){
			System.out.print("Enter Kilo? ");
			int d=as.nextInt();
			
			int Gram=d*1000;
			System.out.print("Gram will be: "+Gram);
		}
		if(a==4){
			System.out.print("Enter Gram? ");
			int f=as.nextInt();
			
			int Kilo=f/1000;
			
			System.out.print("Kilo will be: "+Kilo);
		}
		if(a==5){
			System.out.print("Enter Jave Mark? ");
			int java=as.nextInt();
			
			System.out.print("Enter Oracle Marks? ");
			int orcale=as.nextInt();
			
			System.out.print("Enter VB Marks? ");
			int vb=as.nextInt();
			
			System.out.print("Enter Php Mark? ");
			int php=as.nextInt();
			
			System.out.print("Enter C Marks? ");
			int c=as.nextInt();
			
			int obtained=500-(java+orcale+vb+php+c);
			int percentage=100*obtained/500;
			
			System.out.print("Obtained Marks: "+obtained+"\nTotal Marks: "+500+"\nPercentage: "+percentage);
		}
		if(a==6){
			System.out.print("Enter Troly load ? ");
			int Troly=as.nextInt();
			
			int TotalIncome=Troly*800;
			int Driver=Troly*150;
			int Tax=TotalIncome*10/100;
			int Disel=Troly*210;
			int Profit=TotalIncome-(Driver+Tax+Disel);
			
			System.out.print("Total Income: "+TotalIncome+"\nDriver: "+Driver+"\nTax 10%: "+Tax+"\nDisel: "+Disel+"\nProfit: "+Profit);
			
		}
		if(a==7){
			System.out.print("Enter Employees Basic pay ");
			int employees=as.nextInt();
			
			
			int house=employees*45/100;
			int Medical=employees*15/100;
			int Bonns=employees*5/100;
			int Grosspay=employees+house+Medical+Bonns;
			int IncomeTax=employees*3/100;
			double Zukawat=employees*2.5/100;
			int Convance=employees*8/100;
			
			System.out.print("House Rent 45%: "+house+"\nMedical Allowance 15%: "+Medical+"\nBonns 5%: "+Bonns+"\nGross pay: "+Grosspay+"\nIncome Tax 3%: "+IncomeTax+"\nZukawat 2.5%: "+Zukawat+"\nConvance Allowance 8%: "+Convance);
		
		}
		
		
	}
}
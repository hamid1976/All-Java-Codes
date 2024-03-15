import java.util.*;

class Employees{
	
	public static void main(String arg[]){
		
		Testemployees ob1=new Testemployees();
		
		ob1.Set(1000);
		
		ob1.Calculater();
			
		
	}
}

class Testemployees{
	
	int basicpay;
	
	void Set(int pay){
		
		basicpay=pay;
		
		
	}
	
	
	void Calculater(){
		
			
		   
		   int house=basicpay*45/100;
		   int medical=basicpay*15/100;
		   int bonns=basicpay*5/100;
		   int grosspay=basicpay+house+medical+bonns;
		   int incometax=basicpay*3/100;
		   double zukawat=basicpay*2.5/100;
		   int convance=basicpay*8/100;
		   
		   System.out.print("\nHouse Rent 45%       : "+house+"\nMedical Allowance 15%: "+medical+"\nBonns 5%             : "+bonns+"\nGross Pay            : "+grosspay+"\nIncome Tax 3%        : "+incometax+"\nZukawak 2.5%         : "+zukawat+"\nConvance Allowace 8% : "+convance);
		   
		
	}
	
}




























import java.util.*;

class Trolyload{
	
	
	public static void main(String arg[]){
		
		Trolyload1 ob1=new Trolyload1();
		
		ob1.Set(a);
		
		ob1.Calculater();
		
		
	}
}

class Trolyload1{
	
	int Troly;
	
	void Set(int l){
		
		Troly=l;
	}
	
	void Calculater(){
		
		int totalIncome=Troly*800;
		int Driver=Troly*150;
		int Trolypay=(totalIncome*10)/100;
		int trolyconsume=Troly*210;
		int profit=totalIncome-(Driver+Trolypay+trolyconsume);
		
		System.out.print("\nTotal Income: "+totalIncome);
		System.out.print("\nDriver: "+Driver);
		System.out.print("\nTroly Pay: "+Trolypay);
		System.out.print("\nTroly consume: "+trolyconsume);
		System.out.print("\nProfit: "+profit);
	}
	
	
}
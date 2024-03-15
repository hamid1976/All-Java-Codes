import java.util.*;

class Testoperater7{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 5 Ages ");
		
		int age1=as.nextInt();
		int age2=as.nextInt();
		int age3=as.nextInt();
		int age4=as.nextInt();
		int age5=as.nextInt();
		
		{
		int it1=age1>age2 && age1>age3 && age1>age4 && age1>age5  ?age1:age2;
		System.out.print(it1+" 1st is Greater  ");
		}
		{
		int it2=(age2>age1 && age2>age3 && age2>age4 && age2>age5   )?age2:age1;
		System.out.print(it2+" 2nd is Greater  ");
		}
		{
		int it3=(age3>age1 && age3>age2 && age3>age4 && age3>age5   )?age3:age4;
		System.out.print(it3+" 3nd Greater  ");
		}
		int it4=(age4>age1 && age4>age2 && age4>age3 && age4>age5  )?age4&&:age5;
		int it5=(age5>age1 && age5>age2 && age5>age3 && age5>age4  )?age5&&:age1;
	//	int it2=age2>age1?age2  :age2>age3?age2    :age2>age4?age2  :age2>age5?age2:age5;
	 // int	it3=age3>age1?age3  :age3>age2?age3    :age3>age4?age3  :age2>age5?age3:age5;
	//	int it4=age4>age1?age4  :age4>age2?age4    :age4>age3?age4  :age4>age5?age4:age5;
	//	int it5=age5>age1?age5  :age5>age2?age5    :age5>age3?age5  :age5>age4?age5:age5;
		 
		 
		 
		
		
		
		System.out.print(it4+" 4th Greater  ");
		System.out.print(it5+" 5th Greater  ");
		
	}
}
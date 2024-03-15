import java.util.*;

class Compare{
	
	public static void main(String arg[]){
		
		Testcompare ob1=new Testcompare();
		
		ob1.Set(10,5);
		
		ob1.min();
		ob1.max();
		
		
		
		
	}
	
	
	
}

class Testcompare{
	
	int age1,age2;
	
	void Set(int a, int b){
		
		age1=a;
		age2=b;
	}
	
	void max(){
		
			
		   
		   if(age1>age2)
			   System.out.print("\n1st age is greater");
		   if(age2>age1)
			   System.out.print("\n2nt age is greater");
	}
	
	
	
	
	void min(){
		
		if(age1<age2)
			   System.out.print("\n1st age is less");
		   if(age2<age1)
			   System.out.print("\n2nt age is less");
	}
	
}
















import java.util.*;

class Compare{
	
	public static void main(String arg[]){
		
		Testcompare std1=new Testcompare();
		Testcompare std2=new Testcompare(10,5);
		
		
		std1.max();
		std1.min();
		
		std2.max();
		std2.min();
		
		
	}
	
}

class Testcompare{
	
	int a;
	int b;
	Testcompare(){
		
		a=0;
		b=0;
	}
	Testcompare(int q,int w){
		
		a=q;
		b=w;
		
	}
	
	
	 void max(){
		  
		  
	int	max=a>b?a:b;
	
	System.out.println("Maximum is: "+max);
	  }
		
		void min(){
			
			int min=a<b?a:b;
			System.out.println("Minimum is: "+min);
		}
		
		
	
	
	
}
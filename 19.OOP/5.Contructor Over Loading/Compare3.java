import java.util.*;

class Compare3{
	
	public static void main(String arg[]){
	
	Comp ob1=new Comp();
	Comp ob2=new Comp();
	Comp ob3=new Comp();
	
	
	ob1.Set(10,5);
	ob2.Set(100,50);
	ob3.Set(1000,500);
	
	System.out.println(ob1.min());
	System.out.println(ob1.max());
		
	System.out.println(ob2.min());
	System.out.println(ob2.max());
		
	System.out.println(ob3.min());
	System.out.println(ob3.max());
	
	
	}
}


class Comp{
	
		int age1,age2;
	
	void Set(int a, int b){
		
		age1=a;
		age2=b;
	}
	
	int  max(){
		
			
		   
		   if(age1>age2)
			   return age1;
		   else
			   return age2;
		  
	}
	
	
	
	
	int  min(){
		
		if(age1<age2)
			   return age1;
		   if(age2<age1)
			   return  age2;
		    return 0;
	}
	
}
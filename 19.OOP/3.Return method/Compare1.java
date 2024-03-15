import java.util.*;
class Compare1{
	public static void main(String arg[]){
	Comp ob1=new Comp();
	Comp ob2=new Comp();
	Comp ob3=new Comp();
	
	ob1.Set(10,5);
	ob2.Set(100,50);
	ob3.Set(1000,500);
	
	System.out.print(ob1.min());
	System.out.print(ob1.max());
		
	System.out.print(ob2.min());
	System.out.print(ob2.max());
		
	System.out.print(ob3.min());
	System.out.print(ob3.max());
	}
}
class Comp{	
	int age1,age2;
	void Set(int a, int b){
		age1=a;
		age2=b;
	}
	String max(){	
		if(age1>age2)
			 return "\n1st age is greater";
		if(age2>age1)
			   return "\n2nt age is greater";
				return "";
	}	
	String min(){	
		if(age1<age2)
			   return "\n1st age is less";
		if(age2<age1)
			   return "\n2nt age is less";
		    return "";
	}
}
import java.util.*;

class Calculator{
	
	public static void main(String arg[]){
		
		Addition ob=new Addition();
		
		Addition.add(10,10,50);
		Addition.add(10,20,5);
		Addition.add(10,20,30);
		Addition.add(1000,500);
		
		
		
	}

}

class Addition{
	
	
	static void add(int a, int b){
		
		System.out.println(a+b);
	}
	
	static void add(int a, int b,int c){
		
		System.out.println(a+b+c);
	}
	//sta+n
	static void add(int a, int b, int c,int d){
		
		System.out.println(a+b+c+d);
	}
	
	static void add(double a, double b){
		
		System.out.println(a+b);
	}
	
	static void add(double a, int b){
		
		System.out.println(a+b);
	}
	
	static void add(int a,double b){
		
		System.out.println(a+b);
	}+.	
}
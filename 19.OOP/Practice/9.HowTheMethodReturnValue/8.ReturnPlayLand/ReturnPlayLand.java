import java.util.*;
class ReturnPlayLand{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		Program pro=new Program();
		System.out.println("Calculator Menu");
		
		System.out.println("Enter two values:");
		int a=ob.nextInt();
		int b=ob.nextInt();
		int addition=pro.add(a,b);
		System.out.println("Addition="+addition);
		int subtraction=pro.sub(a,b);
		System.out.println("Subtraction="+subtraction);
		int multiplication=pro.mul(a,b);
		System.out.println("Multiplication="+multiplication);
		int division=pro.div(a,b);
		System.out.println("Division="+division);
		int remainder=pro.rem(a,b);
		System.out.println("Remainder="+remainder);
		
		
		System.out.println("=====================================");
	    System.out.println("Calculator Operator");
		
	    int addition1=pro.CalculatorOp(a,b,'+');
		System.out.println("Addition="+addition1);
		int subtraction1=pro.CalculatorOp(a,b,'-');
		System.out.println("Subtraction="+subtraction1);
		int multiplication1=pro.CalculatorOp(a,b,'*');
		System.out.println("Multiplication="+multiplication1);
		int division1=pro.CalculatorOp(a,b,'/');
		System.out.println("Division="+division1);
		int remainder1=pro.CalculatorOp(a,b,'%');
		System.out.println("Remainder="+remainder1);
		
		System.out.println("=====================================");
	    System.out.println("Square and cube");
		
	    System.out.println("Enter any number:");
		int number1=ob.nextInt();
		
		for(int i=1; i<=number1; i++){
			int sqr1=pro.sqr(i);
			int cube1=pro.cube(i);
			System.out.println(i+"\t"+sqr1+"\t"+cube1+"\n");
		}
		System.out.println("=====================================");
	    System.out.println("Grade");
		
	    System.out.println("Enter any number:");
		int num=ob.nextInt();
		
		String grade1=pro.grade(num);
	    System.out.println("You are"+grade1);
		
		System.out.println("=====================================");
	    System.out.println("Percntage");
       
	    System.out.println("Enter obtain:");
		int obtain1=ob.nextInt();
		System.out.println("Enter Total:");
		int total1=ob.nextInt();
		int percentage=pro.per(obtain1,total1);
		System.out.println("Your percentage is:"+percentage);
	}
}
class Program{
	int add(int a,int b){
		int result=a+b;
		return result;
	}
	int sub(int a,int b){
		int result=a-b;
		return result;
	}
	int mul(int a,int b){
		int result=a*b;
		return result;
	}
	int div(int a,int b){
		int result=a/b;
		return result;
	}
	int rem(int a,int b){
		int result=a%b;
		return result;
	}
	int sqr(int a){
		int result=a*a;
		return result;
	}
	int cube(int a){
		int result=a*a*a;
		return result;
	}
    String grade(int a){
		if(a>40){
			return "Pass";
		}else{
			return "Fail";
		}
	}//end grade
    int per(int obtain,int total){
		int result=obtain*100/total;
		return result;	
	}//end percentage
    int CalculatorOp(int a,int b,char ch){
    if(ch=='+'){
        return a+b;	
	}
	if(ch=='-'){
        return a-b;	
	}
	if(ch=='*'){
        return a*b;	
	}
	if(ch=='/'){
        return a/b;	
	}
	if(ch=='%'){
        return a&b;	
	}
	return ch;
	}//end Calculator Operator
}//end pro class
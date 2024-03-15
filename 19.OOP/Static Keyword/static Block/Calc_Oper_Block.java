class Calc_Oper_Block{
	  static{
		  System.out.println("\nOperator");
	  }
	 Calc_Oper_Block(){
		 char op1='+';
		 char op2='-';
		 char op3='*';
		 char op4='/';
		 char op5='%';
		 int a=20;
		 int b=10;
		 if(op1=='+')
			 System.out.println("\nAddition:"+(a+b));
		 
		 if(op2=='-')
			 
			 System.out.println("Subtraction:"+(a-b));
		 
		 if(op3=='*')
			 
			 System.out.println("Multiplication:"+(a*b));
		 
		 if(op4=='/')
			  System.out.println("Division:"+(a/b));
		 
		 if(op5=='%')
	          System.out.println("Remainder:"+(a%b));
		 			  
	  }
 	  

  public static void main(String arg[]){
	 Calc_Oper_Block s1=new Calc_Oper_Block();
	
 }
}
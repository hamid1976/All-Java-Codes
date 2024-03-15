class student{
	  static int a;
	  static int b;
	  static int e;
	
	 student(int c,int d,char op){
		 a=c;
		 b=d;
		 e=op;
		 if(op=='+')
			 System.out.println("Addition:"+(a+b));
		 if(op=='-')
			 System.out.println("Subtraction:"+(a-b));
		 if(op=='*')
			 System.out.println("Multiplication:"+(a*b));
		 if(op=='/')
			  System.out.println("Division:"+(a/b));
		 if(op=='%')
	          System.out.println("Remainder:"+(a%b)); 
	  }
 	   void display(){
		     System.out.println(a+"  "+b);	  
		   }
 }		   
class Calc_Oper_Static_Variable{
 public static void main(String arg[]){
	 student s1=new student(10,10,'+');
	 student s2=new student(50,6,'-');
	 student s3=new student(10,10,'*');
	 student s4=new student(60,10,'/');
	 student s5=new student(10,10,'%');
	 // s1.display();
	 // s2.display();
	 // s3.display();
	 // s4.display();
	 // s5.display();
	 
   }
 }
import java.util.*;

class Oop1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner();
		
		Calculation cc=new Calculation();
		
		char ch='y';
		
		//(== Main menu Start ==)
		while(ch=='y' || ch=='Y'){
        		
		System.out.print("\n\n main menu\n1.Calculator\n2.unit Convertor\n3.Season\n4.Alphabetic Play Land\n5.Atm\n6.Employ Salary Calculator\n7.Hesco Bill Calculator\n8.Transport.(Troly Load)\n9.Age comparator\n10.Loop Series\n11.About Developer\n12.Exit\n");
		System.out.print("\nEnter Selection ");
		int mini=as.nextInt();
		
		
		
		 //    (==1.Calculator Start ==)
		while(mini==1){
			
			System.out.println("\n\n   Calculator");
			System.out.print("1.Calculator(menu)\n2.Calculator(Operater)\n3.back\n\nEnter Selection ");
			int cl=as.nextInt();
			
			
			//(== Calculation(menu) Start ==)
			while(cl==1){
				System.out.println("\n\n  Calculator(menu)");
				System.out.print("1.Addition\n2.subtraction\n3.Multiplication\n4.Divisor\n5.Remainder\n6.Back\n\nEnter Selection ");
				int menu=as.nextInt();
				
				switch(menu){
					
					case 1:cc.add();break;
					case 2:cc.sub();break;
					case 3:cc.mul();break;
					case 4:cc.div();break;
					case 5:cc.rem();break;
				}
				
				
				
			}//(== Calculation(menu) End ==)
			
			
			
			
		}// (==1.Calculator End ==)
		
		
		
		
		}//(== Main menu End ==)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
	class Calculation{
		
		void add(){
			
			System.out.print(System.in);
			
			System.out.print("Enter Two Value ");
			int a=as.nextInt();
			int b=as.nextInt();
			System.out.print("Addition is: "+(a+b));
		}
		
		void sub(){
			
			System.out.print(System.in);
			
			System.out.print("Enter Two Value ");
			int a=as.nextInt();
			int b=as.nextInt();
			System.out.print("Subtraction is: "+(a-b));
		}
		
		void mul(){
			
			System.out.print(System.in);
			
			System.out.print("Enter Two Value ");
			int a=as.nextInt();
			int b=as.nextInt();
			System.out.print("Multiplication is: "+a*b);
		}
		
		void div(){
			
			System.out.print(System.in);
			
			System.out.print("Enter Two Value ");
			int a=as.nextInt();
			int b=as.nextInt();
			System.out.print("Divison is: "+a/b);
		}
		
		void rem(){
			
			System.out.print(System.in);
			
			System.out.print("Enter Two Value ");
			int a=as.nextInt();
			int b=as.nextInt();
			System.out.print("Remainder is: "+a%b);
		}
		
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

import java.util.*;

 
class Testing{
	
	
	// Scanner ob=new Scanner(System.in);
	
	
	void add(){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Two value ");
				int a=ob.nextInt();
				int b=ob.nextInt();
				System.out.println("Addition is: "+(a+b));
	}
	void sub(){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Two value ");
				int a=ob.nextInt();
				int b=ob.nextInt();
				System.out.println("Subtraction is: "+(a-b));
	}
	void mul(){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Two value ");
				int a=ob.nextInt();
				int b=ob.nextInt();
				System.out.println("multiplication is: "+(a*b));
	}
	
	void div(){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Two value ");
				int a=ob.nextInt();
				int b=ob.nextInt();
				System.out.println("divison is: "+(a/b));
	}
	void rem(){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Two value ");
				int a=ob.nextInt();
				int b=ob.nextInt();
				System.out.println("Remainder is: "+(a%b));
	}

	
	
		
	}
	
	




class Ahmed{
	
	public static void main(String args[]){
		Testing ob=new Testing();
		
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
		ob.rem();
		
	
	
		
		
	
	}
}

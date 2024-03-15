import java.util.*;

class Testloopdowhile12{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
			System.out.print("Enter 1st age ");
		   int age=as.nextInt();
		   
		   System.out.print("Enter 2nd age ");
		   int age2=as.nextInt();
		   
		   if(age>age2)
			   System.out.println("\n1st age is greater");
		   if(age2>age)
			   System.out.println("\n2nt age is greater");
		   
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}

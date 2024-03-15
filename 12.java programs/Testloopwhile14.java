import java.util.*;

class Testloopwhile14{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter 1st age ");
		   int age=as.nextInt();
		   
		   System.out.print("Enter 2nd age ");
		   int age2=as.nextInt();
		   
		   if(age>age2)
			   System.out.println("\n1st age is greater");
		   if(age2>age)
			   System.out.println("\n2nt age is greater");
		   
		   System.out.print("Do you want to run this system again Enter the y/n ");
		   ch=as.next().charAt(0);
		}
		
		
		
	}
}
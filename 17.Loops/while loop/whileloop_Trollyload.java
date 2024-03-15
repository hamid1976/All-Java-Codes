import java.util.*;
class whileloop_Trollyload{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter Trollyload:");
	            int trollyload=ob.nextInt();
				
				int total=trollyload*800;
	            int driver=trollyload*150;
	            int tax=trollyload*80;
	            int diesel=trollyload*210;
	            int profits=total-(driver+tax+diesel);
	   
		
	    	System.out.println("total:"+(total));
			System.out.println("driver:"+(driver));
			System.out.println("tax:"+(tax));
			System.out.println("diesel:"+(diesel));
			System.out.println("profits"+(profits));
			
			System.out.println("Do you want to run again No y/N ?");
			}//end of while loop
	}
}
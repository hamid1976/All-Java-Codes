import java.util.*;

class Testloopwhile11{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			System.out.println("Odd\tEven\n");
			
			for(int a=1; a<=num; a++){
				
				System.out.println(a+"\t"+(++a));
				
			}
			
			System.out.print("Do you want to run this system again Enter the y/n ");
			ch=as.next().charAt(0);
			
		}
		
		
		
		
		
	}
}
import java.util.*;

class Testloopwhile28{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			System.out.print("Odd\tEvet\n");
			int i=1;
			while(i<=num){
				
				System.out.println(i+"\t"+(++i));
				i++;
			}
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}

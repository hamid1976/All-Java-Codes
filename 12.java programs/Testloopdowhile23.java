import java.util.*;

class Testloopdowhile23{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
			System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			int i=0;
			do{
				System.out.print("\n"+i);
				i+=5;
			}
			while(i<=num);
			System.out.print("\nGood bye");
			
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}

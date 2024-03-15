import java.util.*;

class Testloopdowhile26{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			System.out.print("Odd\tEvet\n");
			int i=1;
			do{
				
				System.out.println(i+"\t"+(++i));
				i++;
			}
			while(i<=num);
			
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}

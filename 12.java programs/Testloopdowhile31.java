import java.util.*;

class Testloopdowhile31{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			int i=1, a=2, b=0;
			
			System.out.print(a+"\n");
			do{
				
				a=a+3+b;
				b=b+2;
				System.out.println(a);
				i++;
			}
			while(i<num);
			
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}

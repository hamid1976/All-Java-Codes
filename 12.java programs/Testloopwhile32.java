import java.util.*;

class Testloopwhile32{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			int i=1, a=0, b=1, c;
			while(i<=num){
				
				c=a+b;
				System.out.println(" "+c);
				
				a=b;
				b=c;
				i++;
			}
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}

//(===Fibonaci Series ===)

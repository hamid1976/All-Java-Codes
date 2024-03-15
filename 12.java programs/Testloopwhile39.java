import java.util.*;

class Testloopwhile39{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Any No ");
			String num=as.next();
			
			int leng=num.length();
			
			String a="";
			int i=0;
			while(i<=leng-1){
				
				a=a+num.charAt(i);
				System.out.println(a);
				i++;
			}
			
			
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}

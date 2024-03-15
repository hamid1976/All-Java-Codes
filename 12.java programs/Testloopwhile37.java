import java.util.*;

class Testloopwhile37{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Any No ");
			String num=as.next();
			
			int leng=num.length();
			
			String a="";
			int i=leng-1;
			while(i>0){
				
				a=a+num.charAt(i);
				i--;
			}
			System.out.print(a);
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}

import java.util.*;

class Testloopwhile21{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter your Name ");
		String name=as.next();
		
		int leng=name.length();
		
		int i=leng-1;
		
		while(i>=0){
			
			int k=0;
			
			while(k<=i){
				
				System.out.print(name.charAt(k));
				k++;
			}
			System.out.println();
			i--;
		}
		System.out.print("Do you want to run this system again Enter y  ");
			ch=as.next().charAt(0);
			
		}
		
		
	}
}
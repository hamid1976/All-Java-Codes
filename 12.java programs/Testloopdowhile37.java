import java.util.*;

class Testloopdowhile37{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Name ");
			String num=as.next();
			
			int leng=num.length();
			
			String a="";
			int i=0;
			do{
				
				a=a+num.charAt(i);
				System.out.println(a);
				i++;
			}
			while(i<=leng-1);
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}

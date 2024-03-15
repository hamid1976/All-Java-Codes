import java.util.*;

class Testloopdowhile35{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Name revese ");
			String num=as.next();
			
			int leng=num.length();
			
			String a="";
			int i=leng-1;
			do{
				
				a=a+num.charAt(i);
				i--;
			}
			while(i>0);
			System.out.print(a);
			
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}

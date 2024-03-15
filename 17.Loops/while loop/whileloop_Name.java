import java.util.*;
class whileloop_Name{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter Your name:");
	            String name=ob.next();
				int len=name.length();
				
				int i=len-1;
				while(i>=0){
				int k=0;
				
				while(k<=i){
				System.out.print(name.charAt(k));
				k++;
				}
				System.out.println();
				i--;
				}
				System.out.println("Do you want to do run again y/N ?");
				
				ch=ob.next().charAt(0);
				
			}//end while loop
	}
}				
import java.util.*;
class whileloop_Alphabetic{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch1= 'y';
			while(ch1=='y'||ch1=='Y'){
				
				System.out.print("Enter Alphabetic letter:");
	            char letter=ob.next().charAt(0);
				
				int i=0;
				
				while(i<letter-64){
					
					char ch=65;
					
					while(ch<=letter-i){
						
						System.out.print(ch);
						ch++;
					}
					System.out.println();
					i++;
				}
				System.out.print("Do you want to do run again No y/N ?");
				ch1=ob.next().charAt(0);
			}//end while loop
	}
}				
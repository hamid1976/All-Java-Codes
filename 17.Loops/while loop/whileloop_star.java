import java.util.*;
class whileloop_star{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter any No:");
				int anyNo=ob.nextInt();
				
				
				for(int i=5;  i>=1;  i--){
					for(int j=1;  j<=i; j++){
						System.out.print("*");
					}
				System.out.println();
				}
					System.out.println("Do you want to run again y/N ?");
				
				ch=ob.next().charAt(0);
				
			}//end while loop
	}
}				
			
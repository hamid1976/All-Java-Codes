import java.util.*;
class whileloop_Factorial{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter any No:");
				int anyNo=ob.nextInt();
				
				int n=1;
				for(int i=1;  i<=anyNo;  i++){
					n=n*i;
					System.out.println(n);
				}
				
				System.out.print("Do you want to do more Checking of Factorial No y/N ?");
				
				ch=ob.next().charAt(0);
				
			}//end while loop
	}
}				
				
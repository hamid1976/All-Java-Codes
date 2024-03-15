import java.util.*;
class whileloop_Star1{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter any No:");
	            int anyNo=ob.nextInt();
				int i=0;
				while(i<=anyNo){
				i++;
				int j=anyNo;
				while(j>=i){
				j--;
				System.out.print("*");
				}
				System.out.println();
				}
				System.out.println("Do you want to do run again y/N ?");
			}//end of while loop
	}
}
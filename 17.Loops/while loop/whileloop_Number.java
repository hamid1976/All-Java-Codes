import java.util.*;
class whileloop_Number{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter any No:");
	            int anyNo=ob.nextInt();
				
				
				int i=1;
				while(i<=anyNo){
				int k=anyNo,  j=1;
				
				while(k>=i){
				System.out.print(j);
				k--;
				j++;
				}
				System.out.println();
				i++;
				}
				System.out.println("Do you want to do run again No y/N ?");
				
				ch=ob.next().charAt(0);
				
			}//end while loop
	}
}				
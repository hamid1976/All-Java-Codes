import java.util.*;
class whileloop_Num_Sqr_Cube{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter any No:");
	            int anyNo=ob.nextInt();
				
				for(int i=1;  i<=anyNo; i++){
					System.out.println(i+"     "+(i*i)+"      "+(i*i*i));
				}
				System.out.println("Do you want to do run again No y/N ?");
			}//end of while loop
	}
}
import java.util.*;
class whileloop_Table{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter Table:");
				int Table=ob.nextInt();
				
				System.out.print("Enter counter No:");
				int CounterNo=ob.nextInt();
				
				for (int i=1;  i<=CounterNo; i++){
				System.out.println(Table+"*"+i+"="+(Table*i));
				}
				System.out.println("Do you want to run again y/N ?");
				
				ch=ob.next().charAt(0);
				
			}//end while loop
	}
}				
			

					
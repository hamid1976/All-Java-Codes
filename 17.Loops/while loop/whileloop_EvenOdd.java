import java.util.*;
class whileloop_EvenOdd{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter any No:");
				int anyNo=ob.nextInt();
				
				System.out.print("Odd\tEven\n  ");
				
				for(int i=1;   i<=anyNo;  i++){
					System.out.println(i+"\t"+(++i));
					
				}
					System.out.print("Do you want to do more Checking of even odd No y/N ?");
				
				ch=ob.next().charAt(0);
				
			}//end while loop
	}
}				
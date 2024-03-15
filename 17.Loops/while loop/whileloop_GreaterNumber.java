import java.util.*;
class whileloop_GreaterNumber{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter Three Number:");
				int a=ob.nextInt();
				int b=ob.nextInt();
				int c=ob.nextInt();
			if(a>b){
				if(a>c){
					System.out.println(" A is Greater");
				}
			}
			if(b>a){
				if(b>c){
					System.out.println(" B is Greater");
				}
			}
			if(c>a){
				if(c>b){
					System.out.println(" C is Greater");
				}
			}
			System.out.print("Do you want to do more Comparing No y/N ?");
				
				ch=ob.next().charAt(0);
			}//end while loop
	}
}
				
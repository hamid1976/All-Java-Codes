import java.util.*;
class whileloopSeasson{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter Month No:");
				int Month=ob.nextInt();
				
				if(Month==1||Month==12||Month==11)
					System.out.println("winter");
				
				if(Month==2||Month==3||Month==4)
					System.out.println("Spring");
				
				if(Month==5||Month==6||Month==7)
					System.out.println("Summer");
				
				if(Month==8||Month==9||Month==10)
					System.out.println("Autonm");
				
				System.out.print("Do you want to do more months y/N ?");
				
				ch=ob.next().charAt(0);
			}//end while loop
	}
}
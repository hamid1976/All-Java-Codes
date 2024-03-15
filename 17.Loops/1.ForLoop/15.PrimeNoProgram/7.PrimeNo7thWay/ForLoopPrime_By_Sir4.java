import java.util.Scanner;
class ForLoopPrime_By_Sir4{
	public static void main (String arg[]){
		 Scanner ob = new Scanner(System.in);
		 System.out.print("Enter any No:");
         int num=ob.nextInt();
		 
		 boolean found=true;
		 for(int t=2;  t<=num/2;  t++)
			 if(num%t==0){
				 found=false;
				 break;
			 }
		if(found)
			 System.out.println("Prime No");
		 else
		     System.out.println("Not a Prime No");
			 
			 }
		}
		 
		 
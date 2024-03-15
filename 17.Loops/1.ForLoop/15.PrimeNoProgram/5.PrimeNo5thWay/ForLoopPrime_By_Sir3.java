import java.util.Scanner;
class ForLoopPrime_By_Sir3{
	public static void main (String arg[]){
		 Scanner ob = new Scanner(System.in);
		 System.out.print("Enter any No:");
         int num=ob.nextInt();
		 
		 int counter=0;
		 
		 for(int t=2;  t<=num/2;  t++)
			 if(num%t==0){
				 counter++;
				 break;
			 }
		if(counter==0)
		     System.out.println("Prime No");
		 else
		     System.out.println("Not a Prime No");
			 
			 }
		}
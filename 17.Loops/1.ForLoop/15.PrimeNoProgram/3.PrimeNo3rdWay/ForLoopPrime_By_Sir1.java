import java.util.*;
class ForLoopPrime_By_Sir1{
	public static void main (String arg[]){
		 Scanner ob = new Scanner(System.in);
		 System.out.print("Enter any No:");
         int num=ob.nextInt();
		 
		 int counter=0;
		 
		 for(int t=1;  t<=num;  t++){
			 int result =num%t;
			 if(result==0)
				 counter++;

		 }		 
		 if(counter==2)
			 System.out.println("Prime No");
		 if(counter>2)
			 System.out.println("Not a Prime No");
	}
}
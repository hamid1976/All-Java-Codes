import java.util.*;

class Testloopfor24{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Prime no ");
		int num=as.nextInt();
		
		int counter=0;
		
		for(int t=2; t<=num/2; t++)
			
			if(num%t==0){
				counter++;
				break;
			}
			
			if(counter==0)
				System.out.print("Prime No");
			else
				System.out.print("not a Prime No");
		
		
		
	}
}
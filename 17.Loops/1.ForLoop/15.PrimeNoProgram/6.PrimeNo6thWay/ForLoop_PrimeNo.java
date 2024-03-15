import java.util.*;
class ForLoop_PrimeNo{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any No?");
		int num=ob.nextInt();
	
		int b=0;
		for(int i=2; i<=num/2; i++){
			if(num%i==0){           
				b=1;
			}
		}
		 if(b==1)
		        System.out.println("Not a Prime No");
		 else
		        System.out.print( "Prime No");
			
		  }
	}
	
	
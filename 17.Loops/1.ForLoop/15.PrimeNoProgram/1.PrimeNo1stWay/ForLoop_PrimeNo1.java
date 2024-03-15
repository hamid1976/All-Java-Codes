import java.util.*;
class ForLoop_PrimeNo1{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any No?");
		int num=ob.nextInt();
	
		int b=0;
		for(int i=1; i<=num; i++){
			if(num%i==0)           
			b++;
		}
		if(b==2)
		       System.out.println("  Prime No ");
	    else
		       System.out.print( "Not a Prime No");
     }
}  
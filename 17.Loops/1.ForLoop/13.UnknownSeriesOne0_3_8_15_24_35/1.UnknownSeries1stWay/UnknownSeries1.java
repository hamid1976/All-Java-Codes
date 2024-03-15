import java.util.*;
class UnknownSeries1{
    public static void main(String arg[]){
	Scanner ob=new Scanner(System.in);	
	System.out.print("Enter any no:");
	int count=ob.nextInt();
	
	int n1=3,n=2;
		System.out.print(n1+" ");
		  
		  for(int i=1; i<=count; i++){
		       n1=n1+3+n;
               n=n+2;			
		       System.out.print(" "+n1);	
		  }
	}
}
import java.util.*;
class ForLoop_PrimeNoSeries{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any No?");
		int no=ob.nextInt();
		
		for(int i=2; i<no; i++){
	    int j;
		    for(j=2; j<i; j++){
			   if(i%j==0){
			 	  break;
			   }
		    }//end inner loop
			if(i==j)
			System.out.println(i);
	    }//end outer loop
	}
}
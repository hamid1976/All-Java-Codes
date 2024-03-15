import java.util.*;
class whileloop_PrimeNo{
	
	public static void main(String arg[]){
		int count;
		int j=2;
		while(j<=99){
			j++;
			
			count=0;
			
			int i=1;
			while(i<=j){
				i++;
				if(j%i==0)
					count ++;
			}
			if(count==1)
				System.out.println(j);
		}
	}
}
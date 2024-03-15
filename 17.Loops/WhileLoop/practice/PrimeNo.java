import java.util.*;
class PrimeNo{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any no:");
		int num=ob.nextInt();
		int i=2;
		int counter=0;
		while(i<num){
			if(num%i==0){
				counter=1;
			}
            i++;
		}
		if(counter==1){
			System.out.println(num+" not a Prime No");
		}else
			System.out.println(num+" is Prime No");
     			
	}
}
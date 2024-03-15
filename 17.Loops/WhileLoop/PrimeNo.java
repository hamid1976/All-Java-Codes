import java.util.*;
class PrimeNo{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		char ch='y';
		while(ch=='y'||ch=='Y'){
			System.out.print("Enter Prime no:");
			int num=ob.nextInt();
			
			int b=0;
			int i=2;
			while(i<num){
			if(num%i==0){
				b=1;
				break;
			}
			i++;
			}//end nested while
			if(b==0)
				System.out.println("Prime No");
				if(b==1)
				System.out.println("Not a Prime No");
			
			
			System.out.println("Do you want to run again y? or n?");
			ch=ob.next().charAt(0);
		}
	}
}
			
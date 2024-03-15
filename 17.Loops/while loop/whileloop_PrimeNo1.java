import java.util.*;
class whileloop_PrimeNo1{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter any No:");
	            int anyNo=ob.nextInt();
				
		int i=1;
		
		while(i<=anyNo){
			int k=2, counter=0;
			while(k<=i-1){
				
				if(i%k==0)
					counter=counter+1;
				k++;
			}
			
			if(counter==0){
				System.out.println(i);
			}
			i++;
		    }
			System.out.println("Do you want to do run again No y/N ?");
				ch=ob.next().charAt(0);
			}//end while loop
	}
}				
import java.util.*;
class For_Even_Odd{
    public static void main(String arg[]){
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any No?");
		int anyNo=ob.nextInt();
		
	
		System.out.print("Even\tOdd\n");
		 for(int i=1; i<=anyNo; i++){
			if(i%2==0)
				  System.out.println(""+i);
			         if(i%2!=0)
					System.out.println("       " +i);	 
				
		}
		
		
	} 
}

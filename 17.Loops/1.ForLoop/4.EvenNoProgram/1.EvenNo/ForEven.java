import java.util.*;
class ForEven{
    public static void main(String arg[]){
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any No?");
		int anyNo=ob.nextInt();
		
		for(int i=0; i<=anyNo; i++){
			if(i%2==0){
				System.out.println(""+i);
			}	
				
		}
		
		
	}
}
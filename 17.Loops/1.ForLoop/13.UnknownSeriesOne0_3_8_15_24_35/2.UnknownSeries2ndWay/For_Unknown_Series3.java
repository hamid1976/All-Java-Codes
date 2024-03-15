import java.util.*;
class For_Unknown_Series3{
    public static void main(String arg[]){
	
	Scanner ob=new Scanner(System.in);
		
		 
		System.out.println("Enter any No?");
		int anyNo=ob.nextInt();
		
		int a=0;
		for(int i=2; i<=anyNo; i++){
		    if(i%2!=0){
				System.out.println(a);
			a=a+i;
			}
		}
	}
}
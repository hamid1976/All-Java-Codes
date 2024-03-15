import java.util.*;
class StarPattern5Square{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any No:");
		int anyNo=ob.nextInt();
		
		for(int i=1; i<=anyNo; i++){
		     for(int j=1; j<=anyNo; j++){
			    System.out.print("*");
		     }
			 System.out.println();
		}
	}
}	
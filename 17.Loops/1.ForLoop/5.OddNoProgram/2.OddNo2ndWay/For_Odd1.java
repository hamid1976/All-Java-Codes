import java.util.*;
class For_Odd1{
    public static void main(String arg[]){
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any No?");
		int anyNo=ob.nextInt();
		
		for(int k=1; k<=anyNo; k+=2){
        System.out.print("\n"+k);
		}
	}
}	
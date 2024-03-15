import java.util.*;
class For_Even_Odd1{
    public static void main(String arg[]){
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any No?");
		int anyNo=ob.nextInt();
		
	
		System.out.println("Odd\tEven\n   ");
		 for(int i=1; i<=anyNo; i++){
			 System.out.println(i+"\t"+(++i));
		 }
	}
}
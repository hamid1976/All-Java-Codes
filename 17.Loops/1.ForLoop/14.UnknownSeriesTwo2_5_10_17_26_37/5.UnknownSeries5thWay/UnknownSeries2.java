import java.util.*;
class UnknownSeries2{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Any No:");
		int anyNo=ob.nextInt();
		
		for(int i=1; i<=anyNo; i++){
			System.out.println(i*i+1);
		}
	}
}
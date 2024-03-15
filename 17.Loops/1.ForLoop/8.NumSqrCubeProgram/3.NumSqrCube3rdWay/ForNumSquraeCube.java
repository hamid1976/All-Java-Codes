import java.util.*;
class ForNumSquraeCube{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any No:");
		int anyNo=ob.nextInt();
		System.out.println("Num\tSquare\tCube\t");
		for(int i=1; i<=anyNo; i++){
			System.out.println(i+"      "+(i*i)+"       "+(i*i*i));
		}
	}
}
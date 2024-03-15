import java.util.*;
class Factorial{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any no:");
		int anyNo=ob.nextInt();
		
		int num=1;
		String s="";
		String str="";
		
		for(int i=1; i<=anyNo; i++){
			num*=i;
			s+=str+i;
			str="x";
			System.out.println(s+"="+num);
		}
			
	}
}
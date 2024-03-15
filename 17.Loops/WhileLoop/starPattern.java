import java.util.*;
class starPattern{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=ob.nextInt();
		int i=1;
	    String str="";;
		while(i<=num){
		str+="*";
		System.out.println(str);
		i++;
		}
	}
}
			
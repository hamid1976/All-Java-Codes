import java.util.*;
class StringMethodCompareTo{
	public static void main(String arg[]){
		String s1="e";
		String s2="d";
		int num=s1.compareTo(s2);
		
		if(num==0){
			System.out.println("Both are equal");
		}if(num>0){
			System.out.println("1st Name is greater");
		}if(num<0){
			System.out.println("Second Name is Greater");
		}
	}
}
import java.util.*;

class Bytetomegabyte1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Byte ");
		int a=as.nextInt();
		
		int megabyte=a/1048576;
		
		System.out.print("\nmegabyte will be: "+megabyte);
		
	}
}
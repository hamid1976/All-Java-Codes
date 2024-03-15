 import java.io.*;
 import java.util.*;
class TestBufferedReader{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws Exception{
		Scanner ob = new Scanner(System.in);
		BufferedReader num = new BufferedReader(System.in);
		DataInputStream num1 = new DataInputStream(System.in);
		System.out.print("Enter Your Name : ");
		String name = ob.readLine();
		System.out.print("Enter Your Father Name : ");
		String fname = ob.readLine();
		System.out.println("Your Name : "+name+"\nYour Father Name : "+fname);
	}
}
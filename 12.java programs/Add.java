import java.io.*;

class Add{
	
	public static void main(String arg[])throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.print("Enter First Number ");
		int a=Integer.parseInt(br.readLine());
		
	//	System.out.print("Enter second Number ");
		int b=Integer.parseInt(br.readLine());
		
		System.out.print("Addition is: "+(a+b));
		
		
		
		
		
	}
	
	
	
}
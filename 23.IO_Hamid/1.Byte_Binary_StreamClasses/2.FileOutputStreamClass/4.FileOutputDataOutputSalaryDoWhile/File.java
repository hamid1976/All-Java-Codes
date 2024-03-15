import java.io.*;
import java.util.*;
class File{
	public static void main(String arg[])throws IOException{
		Scanner key=new Scanner(System.in);
		
		FileOutputStream f=new FileOutputStream("abc.txt");
		DataOutputStream file=new DataOutputStream(f);
		//DataInputStream  key=new DataInputStream(System.in);
		
		do{
			System.out.print("Enter Employee Salary:");
			int salary=key.nextInt();
				if(salary<=0)break;
				file.writeInt(salary);
		}while(true);
			System.out.print("Good Bye");
		file.close();
		
	}
}
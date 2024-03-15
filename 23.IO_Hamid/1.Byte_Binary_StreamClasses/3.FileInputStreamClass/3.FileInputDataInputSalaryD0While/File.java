import java.io.*;
import java.util.*;
class File{
	public static void main(String arg[])throws IOException{
		Scanner key=new Scanner(System.in);
		
		FileInputStream f=new FileInputStream("abc.txt");
		DataInputStream file=new DataInputStream(f);
		
		do{
			try{
				int salary=file.readInt();
				if(salary<=0){break;}
				System.out.println("Employee Salary:"+salary);
			}catch(EOFException e){break;}
		}while(true);
			System.out.print("Good Bye");
		f.close();
		
	}
}
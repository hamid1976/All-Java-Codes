import java.util.*;
import java.io.*;
class DataInputAndOutput{
	public static void main(String arg[]){
		FileOutputStream f=new FileOutputStream("a1.txt");
		DataOutputStream file=new DataOutputStream(f);
		FileInputStream f1=new FileInputStream("a1.txt");
		DataIntputStream file1=new DataIntputStream(f1);
		Scanner key=new Scanner(System.in);
		int salary=0;
		do{
			System.out.print("Enter Employee Salary:");
			salary=key.nextInt();
			if(salary<=0){
				break;
			}
			file.writeInt(salary);
		}while(true)
	}
}
import java.util.Scanner
import java.util.*;

class Testing{
	
	
	Scanner ob=new Scanner(System.in);
	
	
	void add(){
		System.out.println("Enter Two value ");
				int a=ob.nextInt();
				int b=ob.nextInt();
				System.out.println("Addition is: "+(a+b));
	}
	
}


class irfan{
	
	public static void main(String args[]){
		Testing ob=new Testing();
		ob.add();
	}
}
import java.util.*;
class CounerTable_In_NestedLoop{
	public static void main(String arg[]){
		 Scanner ob=new Scanner(System.in);
		 
		 System.out.print("Enter Last Table No:");
		 int Table=ob.nextInt();
		 
		 System.out.print("Enter Counter No:");
		 int Counter=ob.nextInt();
		 
		 for(int i=2;  i<=Table; i++){
			 System.out.print("Table:"+i);
			 
			 for(int j=0; j<=Counter; j++){
			 System.out.println(i+"x"+j+"="+(i*j));
             }
         }
	}
}	
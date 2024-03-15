import java.util.*;
class ReverseNumbers_In_NestedLoop{
	public static void main(String arg[]){
		Scanner ob=new Scanner (System.in);
		
		 System.out.print("Enter any No:");
		 int anyNo=ob.nextInt();
		 int num;   
         for(int i=5; i>=1; i--){ // outer loop for rows
         num=1; 
            for(int j=1; j<=i; j++){ // inner loop for Colunms 
                // printing num with a space  
                System.out.print(num+ " "); 
                //incrementing value of num 
                num++ ;
            } 
            System.out.println();// ending line after each row  
        } 
	}
}
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
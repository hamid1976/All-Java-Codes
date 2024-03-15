import  java.util.*;
class NumberSquarePattern{
	public static void main(String arg[]){
		 Scanner ob=new Scanner(System.in);
		 
		  
           System.out.print("Enter Rows: ");
           int Rows=ob.nextInt();
		   
		   System.out.print("Enter Colums: ");
           int Colums=ob.nextInt();
		   int str=0;
		   
		   for (int i=1; i<=Rows; i++){
			
			for(int k=1; k<=Colums ; k++){
				str=k*i;
				System.out.print(str+" ");
			}
			System.out.println(str);
		}
	}
}
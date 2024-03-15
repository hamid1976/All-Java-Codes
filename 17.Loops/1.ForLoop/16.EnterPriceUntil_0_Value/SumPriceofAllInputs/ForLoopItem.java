import java.util.*;
class ForLoopItem{
	public static void main(String arg[]){
		 Scanner ob=new Scanner(System.in);
		 
		  String str="";
		 System.out.print("Enter Total  items: ");
         int a=ob.nextInt();
		 
		 
         System.out.print("Enter 1st Items: ");
         int b=ob.nextInt();
		 System.out.print("Enter 2nd Items: ");
		 int c=ob.nextInt();
		 System.out.print("Enter 3rd Items: ");
		 int d=ob.nextInt();
		 System.out.print("Enter 4th Items: ");
		 int e=ob.nextInt();
		 System.out.print("Enter 5th Items: ");
		 int f=ob.nextInt();
		 
		 str+=b+c+d+e+f;
	
	System.out.print("Total Items are:"+str);
}

	
}
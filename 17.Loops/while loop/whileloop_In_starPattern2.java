import  java.util.*;
class whileloop_In_starPattern2{
	public static void main(String arg[]){
		 Scanner ob=new Scanner(System.in);
		 char ch= 'y';
			while(ch=='y'||ch=='Y'){
		 
		  
           System.out.print("Enter Rows: ");
           int Rows=ob.nextInt();
		   
		   System.out.print("Enter Colums: ");
           int Colums=ob.nextInt();
		   
		   int i=0;
		   while (i<Rows){
			   int k=0;
			   while(k<Colums){
				   System.out.print("*");
				   k++;
			   }
			   System.out.println();
			   i++;
		   }
		   System.out.println("Do you want to do run again No y/N ?");
				ch=ob.next().charAt(0);
			}//end while loop
	}
}				
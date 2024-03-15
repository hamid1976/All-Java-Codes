import java.util.*;
class ForLoopItem1{
	public static void main(String arg[]){
		 Scanner ob=new Scanner(System.in);
		 
		  int str=0;    
		  int str1=0;
		  
		 // System.out.print("Enter price until 0 value: ");
         
		 
		 for (int i=1;  i<=100;  i++){
			 System.out.print("Enter " +i+ " Item price:");
			 int a=ob.nextInt();
			 str+=a;
			 
			 if (a==0){
				 System.out.println("Total sum: "+str+"\n\npress Enter key to contineous");
				 
				 String c=ob.nextLine();
				 String v=ob.nextLine();
				 break;
			 }
				 str1+=1;
			 
			 System.out.print("you have purchased  "  +str1+" items\n");
			 System.out.println("Total Amount is Rs: "+str);
		 }
		 }
		 
	}
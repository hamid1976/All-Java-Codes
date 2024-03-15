import java.util.*;
class Marksheet_1{
  public static void main(String arg[]){
	  
	  Scanner ob=new Scanner(System.in);
	  
	  
	  System.out.println("Enter java Marks:");
	  int java=ob.nextInt();
	   if(java<=39)
		   System.out.println("Fail");
	   
	  System.out.println("Enter PHP Marks:");
	  int php=ob.nextInt();
	  if(php<=39)
		  System.out.println("Fail");
	  
	  System.out.println("Enter English Marks:");
	  int english=ob.nextInt();
	  if(english<=39)
		  System.out.println("Fail");
	  
	  System.out.println("Enter CPP Marks:");
	  int cpp=ob.nextInt();
	  if(cpp<=39)
		  System.out.println("Fail");
	  
	  System.out.println("Enter Python Marks:");
	  int python=ob.nextInt();
	  if(python<=39)
		  System.out.println("Fail");
	  int Total=500;
	  int Obtained=java+php+english+cpp+python;
	  float percentage=Obtained*100/Total;
	  
	  // if(java==39  &&  php==39  &&  english==39 && cpp==39   && python==39)
		  // System.out.println("Fail");
	  
	  System.out.println("Total Marks:"+Total);
	  System.out.println("Obtained Marks:"+Obtained);
	  System.out.println("percentage:"+percentage);
	  
  }
}
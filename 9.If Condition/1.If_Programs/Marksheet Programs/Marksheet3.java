import java.util.*;
class Marksheet3{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		
	
	 System.out.println("Enter The Marks  ");	
	
		
		System.out.println("Enter The Marks of Java  ");	
		int Java=ob.nextInt();
		System.out.println("Enter The PHP Marks");
		int PHP=ob.nextInt();
		System.out.println("Enter The Science Marks");
		int Science=ob.nextInt();
	    System.out.println("Enter The History Marks");
	    int History=ob.nextInt();
	    System.out.println("Enter The Geography Marks");
		int Geography=ob.nextInt();
		System.out.println("Total="+(500));
		int ObtainedMarks=(Java+PHP+Science+History+Geography);
		System.out.println("ObtainedMarks="+ObtainedMarks); 
		int Percentage=(ObtainedMarks)*100/500;
	    System.out.println("Percentage="+Percentage);
	    

        
		
		if(Percentage>=90 && Percentage<=100)
		    System.out.println("Grade is A1");
		if(Percentage>=80 && Percentage<90)
            System.out.println("Grade is A");
	    if(Percentage>=70 && Percentage<80)
		    System.out.println("Grade is B");
	    if(Percentage>=60 && Percentage<70)
		    System.out.println("Grade is C");
		if(Percentage>=50 && Percentage<60)
			System.out.println("Grade is D");
		if(Percentage>=40 && Percentage<50)
			System.out.println("Grade is E");
		if(Percentage<=39)
			System.out.println("Fail");
		    
      
		 
	}
	}
  }
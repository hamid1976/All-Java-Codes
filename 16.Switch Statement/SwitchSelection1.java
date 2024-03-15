import java.util.*;
class SwitchSelection1{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		System.out.println("1.java\n2.English\n3.PHP\n4.Science\n5.Python\n6.Exit");
	
		System.out.println(" Enter selection? ");
		int selection=ob.nextInt();
		
		int java=0;
		int English=0;
		int PHP=0;
		int Science=0;
		int Python=0;
		
		switch(selection){
		
		case 1:System.out.println("Enter java Marks?");
		       java =ob.nextInt();
			   
			  
		case 2:System.out.println("Enter English Marks?");
		       English =ob.nextInt();
			   
			  
        case 3:System.out.println("Enter PHP Marks?");
		       PHP =ob.nextInt();
			   
			  
        case 4:System.out.println("Enter Science Marks?");
		       Science =ob.nextInt();
			   
			
        case 5:System.out.println("Enter Python Marks?");
		       Python =ob.nextInt();
			   break;
			  		
        default:System.out.println("Invalid Percentage");
		}
        
        System.out.println("Total="+(500));
		int ObtainedMarks=(java+English+PHP+Science+Python);
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


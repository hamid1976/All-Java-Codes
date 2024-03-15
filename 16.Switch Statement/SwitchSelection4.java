import java.util.*;
class SwitchSelection4{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		
		   
		    
		
		 System.out.println("1.feet to inch\n2.inch to feet\n3.kilo to gram\n4.gram to kilo");
		
		
				 System.out.print("Enter your selected:");
         int selected=ob.nextInt();
		  
		  switch(selected){
			 
			 case 1:
				System.out.print("Enter feet:");
			    int feet=ob.nextInt();
			    int inch=feet*12;
				System.out.println("inch="+inch);
			 break;
			 
			 case 2:
				System.out.println("Enter inch:");
				int a=ob.nextInt();
			    int b=a/12;
				System.out.println("feet="+b);
			 break;
			
			 case 3:
				  System.out.print("Enter kilo:");
				   int kilo=ob.nextInt();
				   int gram=kilo*1000;
				   System.out.println("gram="+gram);
			  break;
			
			 case 4:
			   System.out.print("Enter gram:");		   
			   int c=ob.nextInt();
			 int d=c/1000;
			   System.out.println("kilo="+d); 
			 break;
			  
			default:System.out.println("invalid choice");			
		}
		}

		 }
		 
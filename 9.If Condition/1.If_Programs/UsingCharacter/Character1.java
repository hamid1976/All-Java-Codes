import java.util.*;
class Character1{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print(" Enter character: ");
		char ch = ob.nextLine().charAt(0);
		
		
			
			
			if(ch>=91 && ch<=96){
				System.out.println("'"+ch+"'"+" is Brackets ");
			}
			
			if(ch>=97 && ch<=122){
				
				System.out.println("'"+ch+"'"+" is lowerCase Alphabetic Letter");
			}
			
			if(ch>=65 && ch<=90){
				
				System.out.println("'"+ch+"'"+"  is UpperCase Alphabetic Letter");
			}
				
			if(ch>=43 && ch<=47){
				
					System.out.println("'"+ch+"'"+ " is Arthimatic Operators");
			}
			if(ch>=48 && ch<=57){ //for 0 to 9
				
				  System.out.println("'"+ch+"'"+" is Decimal number");
			}
			
			
			if(ch>=128 &&  ch<=255){
				System.out.println("'"+ch+"'"+" is graphic character ");
			}
			
			if(ch>=0  && ch<=127){
				    System.out.println("'"+ch+"'"+"  is Keyboard character ");
					
			}
		    if (ch==8)
			    System.out.println("'"+ch+"'"+"  is backspace ");
		   
			if(ch==27)
				System.out.println("'"+ch+"'"+"  is Escape ");
			   
			if (ch==32)
			   System.out.println("'"+ch+"'"+"  is  space");
		   
			 // if(ch>=8  && ch>=27 && ch>=32){
				  // System.out.println("'"+ch+"'"+"  is  ");
			 // }
				 
		     // char ch1=8;
			  // System.out.println("'"+ch1+"'"+"  is backspace ");
		      // char ch2=27;
			  // System.out.println("'"+ch2+"'"+"  is Escape ");
			   // char ch3=32;
			  // System.out.println("'"+ch3+"'"+"  is space ");
		  
		   
		   
		
}
}
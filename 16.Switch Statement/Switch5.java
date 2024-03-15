import java.util.*;
class Switch5{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
         System.out.println("1.feettoinch\n2.inchtofeet\n3.kilotogram\n4.gramtokilo");
		 
		 System.out.print("Enter your selected:");
         int selected=ob.nextInt();
		 switch(selected){
		  if(selected==1){
			  
			 System.out.print("Enter feet:");
			 int feet=0;
			 int inch=0;
			 case 1:System.out.println("feet="+feet);
			        feet=ob.nextInt();
			 case 2:System.out.println("inch="+inch);
			        inch=ob.nextInt();
			 int feet=inch*12;
		 }
     	if(selected == 2){
              case 1:System.out.print("Enter inch:");			
			  int inch=ob.nextInt();
			  int feet=inch/12;
			  case 2:System.out.println("feet="+feet);
			 
			  
		}
        if(selected == 3){
              case 1: System.out.print("Enter kilo:");
			   int kilo=ob.nextInt();
			   int gram=kilo*1000;
			  case 2: System.out.println("kilo="+kilo);
			   case 3:System.out.println("gram="+gram);
			   
		}
        if(selected == 4){
        	   case 1:System.out.print("Enter gram:");
			   int gram=ob.nextInt();
			   int kilo=gram/1000;
			   case 2: System.out.println("kilo="+kilo);
			 
        }	
	}
		}
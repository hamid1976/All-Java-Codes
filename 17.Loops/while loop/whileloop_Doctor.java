import java.util.*;
class whileloop_Doctor{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				
				System.out.print("1.Fever  \n2.Headpaine  \n3.Stomicpaine \n4 Enter selection");
				int a,b,c;
	            int medicin=ob.nextInt();
				
				if(medicin==1){
					System.out.print("1.malaria fever \n2.Typhid fever  \n3.normal fever \n4 Enter select");
					int fever =ob.nextInt();
					if(fever==1)
						System.out.println("Eat chloroquine");
		            if(fever==2)
						System.out.println("Eat voltral");
				    if(fever==3)
						System.out.println("Eat panadol");
				}	
		       if(medicin==2){
					   System.out.print("1.Headpaine  \n2. migraine  \n3 Enter select"); 
                       int headpaine=ob.nextInt();					   
				   if(headpaine==1)
                      System.out.println("Eat Asprine");
				   if(headpaine==2)	
					System.out.println("Eat Stress reliver");
			   }
			  if(medicin==3){
				  System.out.print("1.Diareia  \n2.Stomicpaine \n3. Enter select ");
				  int stomic=ob.nextInt();
				  
				  if(stomic==1)
                      System.out.println("Eat Dipro Foxacin");
				  if(stomic==2)	
					System.out.println("Drink Eno");
			  }
				System.out.println("Do you want to do run again y/N ?");
			}//end of while loop
	}

import java.util.*;

class DoctorWhileLoop{

	public static void main(String arg []){
	
      Scanner ob = new Scanner (System.in);
	  char ch = 'Y';
	  while(ch=='y'||ch=='Y'){
	  System.out.print("1.fever \n2.Head pain \n3.Stomic pain\nEnter situation ");
	  int  a,b,c;
	  int medicin=ob.nextInt();
	  if(medicin==1){
		  System.out.print("1.malaria fever \n2.typhoid fever \n3.normal fever \nEnter Selection fever");
		  int fever=ob.nextInt();
		  if(fever==1)
			  System.out.println("Chloroquine");
		  if(fever==2)
		      System.out.println("Voltral");
		  if(fever==3)
		      System.out.print("Penadol");		  
	  }
	  if(medicin==2){
		  System.out.print("1.Head pain \n2.Migraine \nEnter selection");
		  int headpain=ob.nextInt();
		  if(headpain==1)
			  System.out.println("Asprine");
		  if(headpain==2)
		      System.out.println("Stress reliver");
	  }
	  if(medicin==3){
		  System.out.print("1.Diarrhea \n2.Stomic \nEnter selection");
		  int stomic=ob.nextInt();
		  if(stomic==1)
			  System.out.println("Dipro Aoxacin");
		  if(stomic==2)
		      System.out.println(" Eno");
	  }
	  System.out.print("\nDo you  want to do more calculate Y/n ?");
		             ch =ob.next().charAt(0);
			}
	}
}
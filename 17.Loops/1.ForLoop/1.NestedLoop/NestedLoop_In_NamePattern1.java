import java.util.*;
class NestedLoop_In_NamePattern1{
	public static void main(String arg[]){
		 Scanner ob=new Scanner(System.in);
		 	  
          System.out.print("Enter any Name: ");
          String name=ob.next();
		
		  int k=name.length();
          String s="";
			for(int i=k-1;i>=0;i--){

				for(int j=0; j<=i;j++){
				     System.out.print(name.charAt(j)); 
			    }
			   	System.out.println();
			}    
	}
}
// sachal
// sacha
// sach
// sac
// sa
// s
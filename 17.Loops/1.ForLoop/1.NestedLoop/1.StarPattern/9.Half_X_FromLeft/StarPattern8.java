import java.util.*;
class StarPattern8{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any No:");
		int anyNo=ob.nextInt();
		
		for(int i=1; i<=anyNo; i++){
		     for(int j=1; j<=anyNo; j++){
				 if(j==i)
				 System.out.print("*");
			 else
				 System.out.print(" ");
			 }
			 System.out.println();
		}
		for(int i=1; i<=anyNo; i++){
		     for(int j=1; j<=anyNo; j++){
				 if(j==anyNo-i)
				 System.out.print("*");
			 else
				 System.out.print(" ");
			 }
			 System.out.println();
		}
	}
}
// output
// *
 // *
  // *
   // *
    // *
   // *
  // *
 // *
// *
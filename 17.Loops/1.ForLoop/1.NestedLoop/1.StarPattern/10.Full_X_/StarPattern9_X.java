import java.util.*;
class StarPattern9_X{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any No:");
		int anyNo=ob.nextInt();
		
		for(int i=1; i<=anyNo; i++){
		     for(int j=1; j<i; j++){
	              System.out.print(" ");
			 }
			 for(int j=i; j==i; j++){
				 System.out.print("*");
			 }
			 for(int j=anyNo; j>i; j--){
	              System.out.print(" ");
			 }
			 for(int j=1; j<anyNo; j++){
				 if(j==anyNo-i)
				 System.out.print("*");
			 else
				 System.out.print(" ");
			 }
			 System.out.println();
        }///end first outer loop
       
		for(int i=1; i<=anyNo; i++){
			for(int j=1; j<anyNo; j++){
				if(j==anyNo-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<anyNo; j++){
				if(j==i)
				System.out.print("*");
			    else
					System.out.print("");
			}
			System.out.println();
		}//end 3rd outer loop
	}
}
import java.util.*;
class For_Num_Sqr_Cube{
    public static void main(String arg[]){
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any No?");
		int anyNo=ob.nextInt();
		
		
		        System.out.println("Num:  Square: Cube:");
		        for(int i=0; i<=anyNo;       i++){
		     
				System.out.println(i+":       "+(i*i)+":      "+(i*i*i));
				
			}	
				
		}
		
	}

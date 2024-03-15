import java.util.*;
class For_Num_Sqr_Cube1{
    public static void main(String arg[]){
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any No?");
		int anyNo=ob.nextInt();
		
		
		        System.out.println("Num\tSquare\t Cube\n");
		        for(int i=0; i<=anyNo;       i++){
		     
				System.out.println((i)+"\t" +(i*i)+ "\t"  +(i*i*i));
				
				}
	}
}
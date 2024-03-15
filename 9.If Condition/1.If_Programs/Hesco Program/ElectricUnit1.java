import java.util.*;
class ElectricUnit1
{
    public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter ElectricUnit?");
		int ElectricUnit=ob.nextInt();
		
		if(ElectricUnit>=1 && ElectricUnit<=100){
			
		   ElectricUnit=ElectricUnit*2;
		}
	
	   if(ElectricUnit>=100 && ElectricUnit<=200){
		   ElectricUnit=(100*2)+(ElectricUnit - 100)*4;
	   }
	   
		
		 if(ElectricUnit>=200 && ElectricUnit<=300){
		ElectricUnit=(100*2)+(100*4)+ (ElectricUnit - 200)*6;
		 }
		
		  if(ElectricUnit>=300 && ElectricUnit<=400){
		ElectricUnit=(100*2)+(100*4)+(100*6)+(ElectricUnit - 300)*8;
		  }
		
		 if(ElectricUnit>=400){
		 ElectricUnit=(100*2)+(100*4)+(100*6)+(100*8)+(ElectricUnit - 400)*10;
		 }
		 
		
}
}

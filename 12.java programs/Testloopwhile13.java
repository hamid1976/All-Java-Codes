import java.util.*;

class Testloopwhile13{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter Season No ");
		int Month=as.nextInt();
		
		String season;
		
		switch(Month){
			case 11:
			case 12:
			case 1:
			season = "Winter";break;
			case 2:
			case 3:
			case 4:
			season = "Spring";break;
			case 5:
			case 6:
			case 7:
			season = "Summer";break;
			case 8:
			case 9:
			case 10:
			season = "Autumn";break;
			default:
			season = "Invalid Month";
		}
		System.out.println(season);
		
		System.out.print("Do you want to run this system again Enter the y/n ");
		ch=as.next().charAt(0);
			
			
			
			
		}
		
		
		
		
		
	}
}
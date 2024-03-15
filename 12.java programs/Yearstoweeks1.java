import java.util.*;

class Yearstoweeks1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter the Years ? ");
		int years=as.nextInt();
		
		System.out.print("Enter the Weeks ? ");
		int week=as.nextInt();
		
		int weeks=years*52;
		int days=years*365;
		int hours=years*8760;
		int minutes=years*525600;
		double seconds=years*31536000;
		
		System.out.print("\nWeeks will be: "+weeks);
		System.out.print("\nDays will be:"+days);
		System.out.print("\nHours will be:"+hours);
		System.out.print("\nMinutes will be:"+minutes);
		System.out.print("\nSeconds will be:"+seconds);
		
		int years1=week/52;
		int days1=week/7;
		int hours1=week*168;
		int minutes1=week*10080;
		int seconds1=week*604800;
		
		System.out.print("\n\nYears will be:"+years1);
		System.out.print("\nDays will be:"+days1);
		System.out.print("\nHours will be:"+hours1);
		System.out.print("\nMinutes will be:"+minutes1);
		System.out.print("\nSeconds will be:"+seconds1);
		
		
	}
}
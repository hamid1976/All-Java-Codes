public class Main
{
	public static void main(String[] args) {
		int lightspeed;
		long days ;
		long second ;
		long distance ;
		//approxmate speed of light in miles per second
		lightspeed = 186000 ;
		days = 1000; //specifynumber of days her
		second = days*24*60;// convert to a second
		distance=lightspeed*second;// compute distance
		System.out.print("In "+days);
		System.out.print(" days light will travel abaut ");
		System.out.println(distance+" miles");	}
}
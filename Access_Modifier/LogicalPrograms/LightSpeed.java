class LightSpeed{
	public static void main(String arg[]){
		int LSpeed;
		long days;
		long second;
		long distance;
		
		LSpeed = 186000;
		days= 1000;
		second=days*24*60*60;
		distance=LSpeed*second;
		System.out.print("In "+days);
		days++;
		
		System.out.print("days liht will travel about ");
		System.out.println(distance+" miles");
		System.out.print("In "+days);
	}
}
	

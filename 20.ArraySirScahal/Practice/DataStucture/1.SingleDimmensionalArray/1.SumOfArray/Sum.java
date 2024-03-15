class Sum{
	public static void main(String arg[]){
		int data[]=new int[5];
				//new keyword allocate dynamic memory
		    data[0]=10;
		    data[1]=20;
		    data[2]=30;
		    data[3]=40;
		    data[4]=50;
		
		int sum=data[0]+data[1]+data[2]+data[3]+data[4];
		
		System.out.print("Sum="+sum);
	}
}
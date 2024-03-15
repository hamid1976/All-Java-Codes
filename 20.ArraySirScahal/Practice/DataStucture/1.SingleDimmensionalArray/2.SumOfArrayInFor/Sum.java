class Sum{
	public static void main(String arg[]){
		int data[]=new int[5];
		data[0]=10;
		data[1]=20;
		data[2]=30;
		data[3]=40;
		data[4]=50;
		//Traversing
		//visit each element of an Array called Traversing
		int sum=0;
		for(int i=0; i<data.length;i++){
			System.out.println(data[i]);
			sum+=data[i];
		}
		System.out.println("Total sum="+sum);
	}
}
class FinalVariable{
	public static void main(String arg[]){
		final int data[]=new int[5];
		
		data[0]=500;//ok
		data[1]=2000;//ok
		//data =new int[10];//error cant assign a value to find variable data
		System.out.println(data[0]+data[1]);//2500
		
		// final int data[]=new int[5];
			  // int data1[]=new int[10];
		// data[0]=100;//ok
		// data[1]=1000;//ok
		//data =data1;//error cant assign a value to find variable data
	   //System.out.println(data[0]+data[1]);//1100
	}
}
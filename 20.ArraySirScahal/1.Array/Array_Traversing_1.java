class Array_Traversing_1{
	public static void main(String arg[]){
		
	int sum=0;
	
	int data[]=new int[6];
	
	data[0]=10;
	data[1]=20;
	data[2]=30;
	data[3]=40;
	data[4]=50;
	data[5]=60;
	
	for(int i=0; i<data.length; i++){
		      	System.out.println(data[i]);
	         sum+=data[i]; 
	}
		 System.out.println("Total Sum:"+sum);		 
    }
}
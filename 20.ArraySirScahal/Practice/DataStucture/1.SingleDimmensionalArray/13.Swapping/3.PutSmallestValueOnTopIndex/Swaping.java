class Swaping{
	public static void main(String arg[]){
	int data[]={40,100,20,5,400,15,78,200,34};
	int temp;
		System.out.println("Array Before Swaping");
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
		}
			for(int j=0; j<data.length;j++){
				if(data[j]<data[0]){
					temp=data[j];
					data[j]=data[0];
					data[0]=temp;
				}	
			}

		System.out.println("Array After Swaping");
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
		}
		
	}
}